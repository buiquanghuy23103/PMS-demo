package test.model;

import java.util.List;

/* Class info: This class follows the structure of the request body specified in Section "Request Body" 
 * of the following link:
 * 
 * https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-References/agcapi-batchaddproduct
 *  
 *  */

public class ProductBatchImportReq {
	
	
	
	public ProductBatchImportReq() {
		super();
	}
	
	


	public ProductBatchImportReq(String requestId, List<ProductImportInfo> products) {
		super();
		this.requestId = requestId;
		this.products = products;
	}




	private String requestId;
	
	private List<ProductImportInfo> products;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ProductImportInfo> getProducts() {
		return products;
	}

	public void setProducts(List<ProductImportInfo> products) {
		this.products = products;
	}
	
	

}
