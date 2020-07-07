package test;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import com.alibaba.fastjson.JSON;

import test.model.DefaultProductPriceInfo;
import test.model.ProductBatchImportReq;
import test.model.ProductBatchImportResp;
import test.model.ProductImportInfo;
import test.model.ProductLanguageInfo;
import test.model.ProductPriceInfo;

public class CreateProducts {
	
	public static void createNewProducts(String domain, String clientId, String token, String appId) {
		System.out.println("Creating a new product");
        String requestNum = "123";
        List<ProductImportInfo> products = generateProductList();
        ProductBatchImportReq req = new ProductBatchImportReq(requestNum, products);
        ProductBatchImportResp response = CreateProducts.batchImportProducts(domain, clientId, token, appId, req);
        System.out.println("Response: " + response);
	}

	public static ProductBatchImportResp batchImportProducts(String domain, String clientId, String authorization,
			String appId, ProductBatchImportReq req) {
		
		String url = domain + "/pms/product-price-service/v1/manage/product/batchImportProducts";
		
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

	private static List<ProductImportInfo> generateProductList() {
		ProductImportInfo newProduct = generateProduct();
        List<ProductImportInfo> products = new ArrayList<ProductImportInfo>();
        products.add(newProduct);
		return products;
	}

	private static ProductImportInfo generateProduct() {
		List<ProductLanguageInfo> languages = new ArrayList<ProductLanguageInfo>();
        languages.add(new ProductLanguageInfo("en_US", "Product created by PMS", "This product is created by PMS API"));
        
        List<ProductPriceInfo> prices = new ArrayList<ProductPriceInfo>();
        prices.add(new ProductPriceInfo("FI", "299"));
        prices.add(new ProductPriceInfo("US", "299"));
        
        ProductImportInfo newProduct = new ProductImportInfo();
        newProduct.setProductNo("ProductByPms");
        newProduct.setStatus("active");
        newProduct.setProductName("Product created by PMS");
        newProduct.setProductDesc("This product is for testing purpose only. It was created by PMS API.");
        newProduct.setPurchaseType("consumable");
        newProduct.setDefaultLocale("en_US");
        newProduct.setDefaultPriceInfo(new DefaultProductPriceInfo("FI", "199", "EUR"));
        newProduct.setPrices(prices);
        
        
		return newProduct;
	}

}
