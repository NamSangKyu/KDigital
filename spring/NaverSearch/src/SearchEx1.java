import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class SearchEx1 {
	public static String searchBlog(String text) {
		String clientId = "KHkektMREM4uRRubtXSl";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "trD4iQ7zjS";// 애플리케이션 클라이언트 시크릿값";
		String apiURL = "https://openapi.naver.com/v1/search/blog?query=";
		String msg = null;
		HttpURLConnection con = null;
		DataOutputStream dos = null;
		BufferedReader br = null;

		try {
			text = URLEncoder.encode(text, "UTF-8");
			// url 연결
			URL url = new URL(apiURL+text);
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			// 데이터 전송
			con.setDoOutput(true);
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
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return msg;
	}
	public static void main(String[] args) {
		String msg = searchBlog("오미크론");
		System.out.println(msg);
	}

}








