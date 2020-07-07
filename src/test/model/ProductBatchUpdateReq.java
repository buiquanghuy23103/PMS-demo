package test.model;

public class ProductBatchUpdateReq {
	private String requestId;
	
	private ProductInfo resource;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ProductInfo getResource() {
		return resource;
	}

	public void setResource(ProductInfo resource) {
		this.resource = resource;
	}
	
	
}
