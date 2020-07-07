package test.model;

/* Class info: Please refer to Section "DefaultProductPriceInfo" in the following link for more info on class properties:
 * 
 * https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-References/agcapi-batchaddproduct
 *  
 *  */

public class DefaultProductPriceInfo {
	
	
	
	public DefaultProductPriceInfo() {
		super();
	}
	
	

	public DefaultProductPriceInfo(String country, String price, String currency) {
		super();
		this.country = country;
		this.price = price;
		this.currency = currency;
	}



	private String country;
	
	private String price;
	
	private String currency;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	

}
