
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

    /**
     * Token domain name.
     */
    private static String domain = "";

    /**
     * clientId
     */
    private static String clientId = "";

    /**
     * clientSecret
     */
    private static String clientSecret = "";

    /**
     * App ID.
     */
    private static String appId = "";
    
    private static String productNo = "";

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        // Obtain the token.
    	System.out.println("Fetching token");
        String token = GetToken.getToken(domain, clientId, clientSecret);
        
        System.out.println("token: " + token);

        // Query app information.
        System.out.println("Fetching app info");
        GetAppInfo.getAppInfo(domain, clientId, token, appId, "en-US");

        // Update app information.
        //UpdateAppInfo.updateAppInfo(domain, clientId, token, appId);

        // Upload the file.
        //List<FileInfo> files = UploadFile.uploadFile(domain, clientId, token, appId, "png");

        // After file upload, call the API for updating app file information.
        //UploadAppFileInfo.updateAppFileInfo(domain, clientId, token, appId, files);

        // Submit for review.
        //SubmitAudit.submit(domain, clientId, token, appId);
        
        //Get product info
        System.out.println("Fetching product info");
        GetIapProductInfo.getProductInfoDetail(domain, clientId, token, appId, productNo);
        
        // Create a product
        System.out.println("Creating a new product");
        String requestNum = "123";
        
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
        
        
        List<ProductImportInfo> products = new ArrayList<ProductImportInfo>();
        products.add(newProduct);
        
        ProductBatchImportReq req = new ProductBatchImportReq(requestNum, products);
        ProductBatchImportResp response = CreateProducts.batchImportProducts(domain, clientId, token, appId, req);
        System.out.println("Response: " + response);
        
    }

}
