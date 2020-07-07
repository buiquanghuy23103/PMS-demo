package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.Consts;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Utils {
	
	public static void setHttpHead(String clientId, String authorization, String appId,
			HttpRequestBase requestEntity) {
		requestEntity.setHeader("Authorization", "Bearer " + authorization);
		requestEntity.setHeader("client_id", clientId);
		requestEntity.setHeader("appId", appId);
	}

	public static String getApiResp(HttpRequestBase requestEntity) {
	    try {
	        CloseableHttpClient httpClient = HttpClients.createDefault();
	        CloseableHttpResponse httpResponse = httpClient.execute(requestEntity);
	        int statusCode = httpResponse.getStatusLine().getStatusCode();
	        if (statusCode == HttpStatus.SC_OK) {
	            BufferedReader br =
	                new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent(), Consts.UTF_8));
	            String result = br.readLine();
	            return result;
	        } else {
	        	System.out.println("Request failed. Status code: " + statusCode);
	        }
	    } catch (Exception e) {
	    	printErrorMessage(e);
	    }
	    return null;
	}
	
	public static boolean isNotNullOrEmpty(String string) {
		
		if (string == null) return false;
		
		if (string.length() == 0) return false;
		
		return true;
		
	}
	
	public static void printErrorMessage(Exception e) {
		System.out.println("toString(): " + e.toString());
        System.out.println("getMessage(): " + e.getMessage());
        System.out.println("StackTrace: ");
        e.printStackTrace();
	}

}
