
package test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import test.model.DefaultProductPriceInfo;
import test.model.ProductBatchImportReq;
import test.model.ProductBatchImportResp;
import test.model.ProductImportInfo;
import test.model.ProductLanguageInfo;
import test.model.ProductPriceInfo;

public class PmsApiDemo {

    
	private static String domain = "https://connect-api.cloud.huawei.com/api/";

    /**
     * TODO: Replace with the ID of the API client. 
     */
    private static String clientId = "";

    /**
     * TODO: Replace with the Key of the API client.
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

        // CreateProducts.createNewProducts(domain, clientId, token, appId);
        
        GetIapProductInfo.getProductInfoDetail(domain, clientId, token, appId, productNo);
        
    }

	

}
