package test;

import org.apache.http.client.methods.HttpGet;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import test.model.FileInfo;
import test.model.FileServerOriResult;
import test.model.ProductDetailQueryResp;

public class GetIapProductInfo {
	public static ProductDetailQueryResp getProductInfoDetail(String domain, String clientId, String authorization,
			String appId, String productNo) {
		String url = domain + "pms/product-price-service/v1/manage/product";
		
		HttpGet get = new HttpGet(url + "?productNo=" + productNo);
		Utils.setHttpHead(clientId, authorization, appId, get);
		String result = Utils.getApiResp(get);
		if (Utils.isNotNullOrEmpty(result)) {
			System.out.println("Product info: " + result);
			return JSON.parseObject(result, ProductDetailQueryResp.class);
		} else {
			System.out.println("response is null or empty.");
		}
		return null;
	}

}