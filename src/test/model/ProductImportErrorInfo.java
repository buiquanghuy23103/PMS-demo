package test.model;

/* Class info: This class follows the structure of the object specified in Section "ProductImportErrorInfo" 
 * of the following link:
 * 
 * https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-References/agcapi-batchaddproduct
 *  
 *  */

public class ProductImportErrorInfo {
	
	
	
	public ProductImportErrorInfo() {
		super();
	}

	

	public ProductImportErrorInfo(String productNo, Integer errorReason) {
		super();
		this.productNo = productNo;
		this.errorReason = errorReason;
	}



	private String productNo;
	
	private Integer errorReason;

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public Integer getErrorReason() {
		return errorReason;
	}

	public void setErrorReason(Integer errorReason) {
		this.errorReason = errorReason;
	}
	
	

}
