package test.model;

/* Class info: 
 * 
 * https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-References/agcapi-batchaddproduct#ProductPriceInfo 
 * 
 * */

public class ProductPriceInfo {
	
	
	
	
	public ProductPriceInfo() {
		super();
	}
	
	

	public ProductPriceInfo(String country, String price) {
		super();
		this.country = country;
		this.price = price;
	}



	private String country;
	
	private String price;

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

}
