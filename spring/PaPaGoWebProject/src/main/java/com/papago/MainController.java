package com.papago;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	public static String papagoTranslate(String source, String target, String text) {
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
			String postParams = "source="+source+"&target=" + target + "&text=" + text;
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
	
	@RequestMapping("translate.do")
	public String translate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String source = request.getParameter("source");
		String target = request.getParameter("target");
		String text = request.getParameter("text");
		
		String result = papagoTranslate(source, target, text);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(result);
		
		
		return null;
	}
	
	@RequestMapping("/")
	public String main() {
		return "papago_main";
	}
}
