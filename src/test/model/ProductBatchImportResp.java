package test.model;

import java.util.List;

/* Class info: This class follows the structure of the response body specified in Section "Output Parameters" 
 * of the following link:
 * 
 * https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-References/agcapi-batchaddproduct
 *  
 *  */

public class ProductBatchImportResp {

	private String error;
	
	private Integer failedNumber;
	
	private Integer successNumber;
	
	private List<ProductImportErrorInfo> resultInfo;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Integer getFailedNumber() {
		return failedNumber;
	}

	public void setFailedNumber(Integer failedNumber) {
		this.failedNumber = failedNumber;
	}

	public Integer getSuccessNumber() {
		return successNumber;
	}

	public void setSuccessNumber(Integer successNumber) {
		this.successNumber = successNumber;
	}

	public List<ProductImportErrorInfo> getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(List<ProductImportErrorInfo> resultInfo) {
		this.resultInfo = resultInfo;
	}
	
	
}
