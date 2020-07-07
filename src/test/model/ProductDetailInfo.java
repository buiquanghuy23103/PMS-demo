package test.model;

import java.util.List;

/* Class info: This class follows the structure of the object specified in Section "ProductDetailInfo" 
 * of the following link:
 * 
 * https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-References/agcapi-getproductdetailinfo#ProductDetailInfo 
 * 
 * */

public class ProductDetailInfo {

	private String id;
	
	private String productNo;
	
	private String productName;
	
	private String price;
	
	private String purchaseType;
	
	private Integer resourceType;
	
	private String localPrice;
	
	private String updateTime;
	
	private String status;
	
	private String currency;
	
	private String country;
	
	private String defaultTier;
	
	private String defaultLocale;
	
	private String productDesc;
	
	private Integer isPromotion;
	
	private String groupId;
	
	private String periodUnit;
	
	private Integer numberOfUnits;
	
	private String developerId;
	
	private List<ProductLanguageInfo> languages;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPurchaseType() {
		return purchaseType;
	}

	public void setPurchaseType(String purchaseType) {
		this.purchaseType = purchaseType;
	}

	public Integer getResourceType() {
		return resourceType;
	}

	public void setResourceType(Integer resourceType) {
		this.resourceType = resourceType;
	}

	public String getLocalPrice() {
		return localPrice;
	}

	public void setLocalPrice(String localPrice) {
		this.localPrice = localPrice;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
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

	public String getDefaultTier() {
		return defaultTier;
	}

	public void setDefaultTier(String defaultTier) {
		this.defaultTier = defaultTier;
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

	public Integer getIsPromotion() {
		return isPromotion;
	}

	public void setIsPromotion(Integer isPromotion) {
		this.isPromotion = isPromotion;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getPeriodUnit() {
		return periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
	}

	public Integer getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(Integer numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	public String getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(String developerId) {
		this.developerId = developerId;
	}

	public List<ProductLanguageInfo> getLanguages() {
		return languages;
	}

	public void setLanguages(List<ProductLanguageInfo> languages) {
		this.languages = languages;
	}
	
}
