package sort_integer_with_java_access_through_http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CallSortIntegers {
	public static void main(String[] args) {
		String comaSeparatedIntegersToSort = "6,8,3";
		String paramName = "intsToSort";
		String urlServletSort = "http://localhost:8080/sort_integer_with_java_and_servlet_and_webxml/sortIntegers";
		String urlConnection = urlServletSort + "?" + paramName + "=" + comaSeparatedIntegersToSort; 
		HttpURLConnection con = null;
		try {
			URL url = new URL(urlConnection);
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setDoOutput(true);
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);
			int status = con.getResponseCode();
			if(status != 200) {
				System.out.println("Problem, response code : "+status);
			}
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
			    content.append(inputLine);
			}
			in.close();
			System.out.println("response :");
			System.out.println(content);
		} catch(Exception e) {
			System.err.println(e);
		} finally {
			if(con != null) {
				con.disconnect();
			}
		}
	}
}
