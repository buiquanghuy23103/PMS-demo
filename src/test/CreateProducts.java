package test;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import com.alibaba.fastjson.JSON;

import test.model.ProductBatchImportReq;
import test.model.ProductBatchImportResp;

public class CreateProducts {

	public static ProductBatchImportResp batchImportProducts(String domain, String clientId, String authorization,
			String appId, ProductBatchImportReq req) {
		
		String url = domain + "/pms/product-price-service/v1/manage/product/batchImportProducts";
		System.out.println("POST: " + url);
		
		
		HttpPost post = new HttpPost(url);
		Utils.setHttpHead(clientId, authorization, appId, post);
		
		StringEntity entity = new StringEntity(JSON.toJSONString(req), ContentType.create("application/json", "UTF-8"));
		post.setEntity(entity);
		
		String result = Utils.getApiResp(post);
		System.out.println("Response: " + result);
		
		if (Utils.isNotNullOrEmpty(result)) {
			return JSON.parseObject(result, ProductBatchImportResp.class);
		}
		
		return null;
	}

}
