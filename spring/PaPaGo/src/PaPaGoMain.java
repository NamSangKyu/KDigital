import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONObject;

public class PaPaGoMain {
	public static String papagoTranslate(String target, String text) {
		String clientId = "KHkektMREM4uRRubtXSl";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "trD4iQ7zjS";// 애플리케이션 클라이언트 시크릿값";
		String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
		String msg = null;
		HttpURLConnection con = null;
		DataOutputStream dos = null;
		BufferedReader br = null;

		try {
			text = URLEncoder.encode(text, "UTF-8");
			// url 연결
			URL url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			con.setDoOutput(true);
			String postParams = "source=ko&target=" + target + "&text=" + text;
			// 데이터 전송
			dos = new DataOutputStream(con.getOutputStream());
			dos.writeBytes(postParams);
			dos.flush();
			dos.close();
			int responseCode = con.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 응답
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // 에러 응답
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			msg = new String();
			while (true) {
				String str = br.readLine();
				if (str == null)
					break;
				msg += str;
			}
			JSONObject json = new JSONObject(msg);
			msg = (String) json.getJSONObject("message").getJSONObject("result").get("translatedText");

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return msg;
	}

	public static void main(String[] args) {
		String result = papagoTranslate("de", "일본에 태풍 또 가네");
		System.out.println(result);
	}



}
