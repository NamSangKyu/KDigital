package com.example.papago;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spnCode;
    ImageButton btnVoice;
    Button btnTranslate;
    EditText edtOri;
    EditText edtTranslate;
    private PaPaGo papago;
    private static final int RESULT_SPEECH = 1234;
    InputMethodManager imm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnVoice = findViewById(R.id.btn_voice);
        btnTranslate = findViewById(R.id.btn_translate);
        spnCode = findViewById(R.id.spn_lang);
        edtOri = findViewById(R.id.edt_ori);
        edtTranslate = findViewById(R.id.edt_trans);
        imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

        CustomListAdapter customListAdapter = new CustomListAdapter();
        customListAdapter.addItem(getDrawable(R.drawable.fance),"fr");
        customListAdapter.addItem(getDrawable(R.drawable.japan),"ja");
        customListAdapter.addItem(getDrawable(R.drawable.united),"en");
        customListAdapter.addItem(getDrawable(R.drawable.china),"zh-CN");
        spnCode.setAdapter(customListAdapter);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                papago = new PaPaGo();
                papago.execute(edtOri.getText().toString());
                imm.hideSoftInputFromWindow(edtOri.getWindowToken(), 0);
            }
        });
        btnVoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                startActivityForResult(intent, RESULT_SPEECH);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        papago = new PaPaGo();
        if (resultCode == RESULT_OK && (requestCode == RESULT_SPEECH)) {

            ArrayList<String> sstResult = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            /* 육성에 비슷한 단어부터 시작되는 0번째 문자열*/
            String result = sstResult.get(0);
            edtOri.setText(result);
            papago.execute(result);
        }else{
            edtOri.setText("음성 인식에 실패하였습니다.");
            papago.execute("음성 인식에 실패하였습니다.");
        }
    }

    public class PaPaGo extends AsyncTask<String, Void, String> {



        @Override
        protected String doInBackground(String... strings) {
            String result = null;
            String clientId = "애플리케이션 클라이언트 아이디값";//애플리케이션 클라이언트 아이디값";
            String clientSecret = "애플리케이션 클라이언트 시크릿값";//애플리케이션 클라이언트 시크릿값";
            try {
                String text = URLEncoder.encode(strings[0], "UTF-8");
                String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
                URL url = new URL(apiURL);
                HttpURLConnection con = (HttpURLConnection)url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("X-Naver-Client-Id", clientId);
                con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
                // post request
                ListItem item = (ListItem) spnCode.getSelectedItem();
                String postParams = "source=ko&target="+item.getCode()+"&text=" + text;
                con.setDoOutput(true);
                DataOutputStream wr = new DataOutputStream(con.getOutputStream());
                wr.writeBytes(postParams);
                wr.flush();
                wr.close();
                int responseCode = con.getResponseCode();
                BufferedReader br;
                Log.i("runTranslate",String.valueOf(responseCode));
                if(responseCode==200) { // 정상 호출
                    br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                } else {  // 에러 발생
                    br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                }
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = br.readLine()) != null) {
                    response.append(inputLine);
                }
                br.close();
                Log.i("runTranslate",response.toString());

                Gson gson = new GsonBuilder().create();
                JsonParser parser = new JsonParser();
                JsonElement rootObj = parser.parse(response.toString()).getAsJsonObject().get("message").getAsJsonObject().get("result").getAsJsonObject().get("translatedText");

                result = rootObj.toString().replace("\"","");
                Log.i("runTranslate", "runTranslate: "+result);


            } catch (Exception e) {
                Log.i("runTranslate",e.getMessage());
            }
            return result;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            edtTranslate.setText(s);
        }
    }
}