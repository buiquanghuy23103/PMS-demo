package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.Consts;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import test.model.Team;

public class ObtainTeamList {

	public static void getUserTeamList(String domain, String oauth2Token) {
		HttpGet get = new HttpGet(domain + "/ups/user-permission-service/v1/user-team-list");
		get.setHeader("oauth2Token", oauth2Token);
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			CloseableHttpResponse httpResponse = httpClient.execute(get);
			int statusCode = httpResponse.getStatusLine().getStatusCode();
			if (statusCode == HttpStatus.SC_OK) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(httpResponse.getEntity().getContent(), Consts.UTF_8));
				String result = br.readLine();
				JSONObject object = JSON.parseObject(result);
				System.out.println("Response: " + object.toString());
				System.out.println("Ret: " + object.get("ret"));
				Team[] teams = (Team[]) object.get("teams");
			}
		} catch (Exception e) {
			Utils.printErrorMessage(e);
		}
	}

}
