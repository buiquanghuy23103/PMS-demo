package test;

import org.apache.http.client.methods.HttpGet;

import com.alibaba.fastjson.JSON;
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