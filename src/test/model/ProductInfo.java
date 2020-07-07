package test.model;

/**
 * Class reference: https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-References/agcapi-updateproduct#ProductInfo
 * */
import java.util.List;

public class ProductInfo {

	private String productNo;
	
	private String appId;
	
	private String productName;
	
	private String purchaseType;
	
	private String status;
	
	private String currency;
	
	private String country;
	
	private String isNeedApprove;
	
	private String defaultPrice;
	
	private Integer force;
	
	private String defaultLocale;
	
	private String productDesc;
	
	private List<ProductLanguageInfo> languages;
	
	private List<ProductPriceInfo> prices;
	
	private String subGroupId;
	
	private Integer subPeriod;
	
	private String subPeriodUnit;

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPurchaseType() {
		return purchaseType;
	}

	public void setPurchaseType(String purchaseType) {
		this.purchaseType = purchaseType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIsNeedApprove() {
		return isNeedApprove;
	}

	public void setIsNeedApprove(String isNeedApprove) {
		this.isNeedApprove = isNeedApprove;
	}

	public String getDefaultPrice() {
		return defaultPrice;
	}

	public void setDefaultPrice(String defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	public Integer getForce() {
		return force;
	}

	public void setForce(Integer force) {
		this.force = force;
	}

	public String getDefaultLocale() {
		return defaultLocale;
	}

	public void setDefaultLocale(String defaultLocale) {
		this.defaultLocale = defaultLocale;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public List<ProductLanguageInfo> getLanguages() {
		return languages;
	}

	public void setLanguages(List<ProductLanguageInfo> languages) {
		this.languages = languages;
	}

	public List<ProductPriceInfo> getPrices() {
		return prices;
	}

	public void setPrices(List<ProductPriceInfo> prices) {
		this.prices = prices;
	}

	public String getSubGroupId() {
		return subGroupId;
	}

	public void setSubGroupId(String subGroupId) {
		this.subGroupId = subGroupId;
	}

	public Integer getSubPeriod() {
		return subPeriod;
	}

	public void setSubPeriod(Integer subPeriod) {
		this.subPeriod = subPeriod;
	}

	public String getSubPeriodUnit() {
		return subPeriodUnit;
	}

	public void setSubPeriodUnit(String subPeriodUnit) {
		this.subPeriodUnit = subPeriodUnit;
	}
	
	
}
