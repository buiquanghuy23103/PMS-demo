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

public class GetConfigFile {

	public static void getConfigFile(String domain, String oauth2Token, String uid, String appId, String teamId) {
		HttpGet get = new HttpGet(domain + "/cpms/project-management-service/v1/config-file?appId=" + appId);
		get.setHeader("oauth2Token", oauth2Token);
		get.setHeader("teamId ", teamId);
		get.setHeader("uid", uid);
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			CloseableHttpResponse httpResponse = httpClient.execute(get);
			int statusCode = httpResponse.getStatusLine().getStatusCode();
			if (statusCode == HttpStatus.SC_OK) {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(httpResponse.getEntity().getContent(), Consts.UTF_8));
				String result = br.readLine();
				JSONObject object = JSON.parseObject(result);
				System.out.println(object.get("ret"));
				String fileName = (String) object.get("fileName");
				String content = (String) object.get("content");
			}
		} catch (Exception e) {
		}
	}

}
