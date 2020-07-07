
package test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import test.model.DefaultProductPriceInfo;
import test.model.FileInfo;
import test.model.ProductBatchImportReq;
import test.model.ProductBatchImportResp;
import test.model.ProductImportInfo;
import test.model.ProductLanguageInfo;
import test.model.ProductPriceInfo;

public class PmsApiDemo {

    
	private static String domain = "https://connect-api.cloud.huawei.com/api/";

    /**
     * TODO: Replace with the ID of the API client in the AppGallery Connect API console. 
     */
    private static String clientId = "";

    /**
     * TODO: Replace with the Key of the API client in the AppGallery Connect API console.
     */
    private static String clientSecret = "";

    /**
     * TODO: Replace with the ID of your application in AppGallery Connect: 
     * Go to AppGallery Connect directly by this link: https://developer.huawei.com/consumer/en/service/josp/agc/index.html
     */
    private static String appId = "";
    
    /**
     * TODO: Replace with the ID of your in-app product
     */
    private static String productNo = "";

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        String token = GetToken.getToken(domain, clientId, clientSecret);

        createNewProducts(token);
        
    }

	private static void createNewProducts(String token) {
		System.out.println("Creating a new product");
        String requestNum = "123";
        List<ProductImportInfo> products = generateProductList();
        ProductBatchImportReq req = new ProductBatchImportReq(requestNum, products);
        ProductBatchImportResp response = CreateProducts.batchImportProducts(domain, clientId, token, appId, req);
        System.out.println("Response: " + response);
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
