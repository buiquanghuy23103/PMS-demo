package test.model;

/* Class info: 
 * 
 * https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-References/agcapi-batchaddproduct#ProductImportInfo
 * 
 * */

import java.util.List;

public class ProductImportInfo {

	public ProductImportInfo() {
		super();
	}

	private String productNo;
	
	private String status;
	
	private String productName;
	
	private String productDesc;
	
	private String purchaseType;
	
	private String subGroupId;
	
	private String subPeriod;
	
	private String subPeriodUnit;
	
	private Integer force;
	
	private String defaultLocale;
	
	private DefaultProductPriceInfo defaultPriceInfo;
	
	private List<ProductLanguageInfo> languages;
	
	private List<ProductPriceInfo> prices;
	
	private PromotionInfo promotion;

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getPurchaseType() {
		return purchaseType;
	}

	public void setPurchaseType(String purchaseType) {
		this.purchaseType = purchaseType;
	}

	public String getSubGroupId() {
		return subGroupId;
	}

	public void setSubGroupId(String subGroupId) {
		this.subGroupId = subGroupId;
	}

	public String getSubPeriod() {
		return subPeriod;
	}

	public void setSubPeriod(String subPeriod) {
		this.subPeriod = subPeriod;
	}

	public String getSubPeriodUnit() {
		return subPeriodUnit;
	}

	public void setSubPeriodUnit(String subPeriodUnit) {
		this.subPeriodUnit = subPeriodUnit;
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

	public DefaultProductPriceInfo getDefaultPriceInfo() {
		return defaultPriceInfo;
	}

	public void setDefaultPriceInfo(DefaultProductPriceInfo defaultPriceInfo) {
		this.defaultPriceInfo = defaultPriceInfo;
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

	public PromotionInfo getPromotion() {
		return promotion;
	}

	public void setPromotion(PromotionInfo promotion) {
		this.promotion = promotion;
	}
	
	

	
}
