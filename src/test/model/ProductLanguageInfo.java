package test.model;

/* Class info: This class follows the structure of the object specified in Section "ProductLanguageInfo" 
 * of the following link:
 * 
 * https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-References/agcapi-getproductdetailinfo#ProductDetailInfo 
 * 
 * */

public class ProductLanguageInfo {
	
	
	
	public ProductLanguageInfo() {
		super();
	}

	public ProductLanguageInfo(String locale, String productName, String productDesc) {
		super();
		this.locale = locale;
		this.productName = productName;
		this.productDesc = productDesc;
	}

	private String locale;
	
	private String productName;
	
	private String productDesc;

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

}
