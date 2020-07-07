package test;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import com.alibaba.fastjson.JSON;

import test.model.DefaultProductPriceInfo;
import test.model.ProductBatchUpdateReq;
import test.model.ProductInfo;
import test.model.ProductLanguageInfo;
import test.model.ProductPriceInfo;

public class UpdateProduct {
	
	public static void update(String domain, String clientId, String token, String appId, String productNo) {
		
		update(domain, clientId, token, appId, generateUpdateRequest(appId, productNo));
		
	}
	
	public static void update(String domain, String clientId, String token, String appId, ProductBatchUpdateReq req) {
		System.out.println("Updating product");
		
		String url = domain + "/pms/product-price-service/v1/manage/product";
	    HttpPut put = new HttpPut(url); 
	    Utils.setHttpHead(clientId, token, appId, put); 
	    StringEntity entity = 
	            new StringEntity(JSON.toJSONString(req), ContentType.create("application/json", "UTF-8")); 
	    put.setEntity(entity);
	    
	    String result = Utils.getApiResp(put); 
	    System.out.println("Updating result: " + result); 
	}
	
	private static ProductBatchUpdateReq generateUpdateRequest(String appId, String productNo) {
		
		List<ProductLanguageInfo> languages = new ArrayList<ProductLanguageInfo>();
        languages.add(new ProductLanguageInfo("en_US", "Product created by PMS", "This product is created by PMS API"));
        
        List<ProductPriceInfo> prices = new ArrayList<ProductPriceInfo>();
        prices.add(new ProductPriceInfo("FI", "299"));
        prices.add(new ProductPriceInfo("US", "299"));
        
		
		ProductInfo productInfo = new ProductInfo();
		productInfo.setProductNo(productNo);
		productInfo.setAppId(appId);
		productInfo.setProductName("Updated product name");
		productInfo.setProductDesc("Updated product description");
		productInfo.setStatus("active");
		productInfo.setDefaultLocale("en_US");
		productInfo.setCountry("FI");
		productInfo.setCurrency("EUR");
		productInfo.setPurchaseType("consumable");
		productInfo.setDefaultPrice("199");
		productInfo.setPrices(prices);
		
		ProductBatchUpdateReq request = new ProductBatchUpdateReq();
		request.setRequestId("123");
		request.setResource(productInfo);
		
		return request;
		
	}

}
