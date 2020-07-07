package test.model;

/* Class info: This class follows the structure of the response body specified in Section "Output Parameters" 
 * of the following link:
 * 
 * https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-References/agcapi-getproductdetailinfo
 *  
 *  */

public class ProductDetailQueryResp {
	
	
	
	private String error;
	
	private ProductDetailInfo product;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public ProductDetailInfo getProduct() {
		return product;
	}

	public void setProduct(ProductDetailInfo product) {
		this.product = product;
	}
	
	
	
}
