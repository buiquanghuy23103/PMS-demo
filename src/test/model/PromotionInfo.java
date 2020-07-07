package test.model;

import java.util.List;

/*
 * Class info: 
 * 
 * https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-References/agcapi-batchaddproduct#PromotionInfo
 * 
 * */

public class PromotionInfo {
	
	
	public PromotionInfo() {
		super();
	}

	private String promotionId;
	
	private String promotionTitle;
	
	private Integer startDate;
	
	private Integer endDate;
	
	private String status;
	
	private String strategy;
	
	private String price;
	
	private Integer numberOfUnits;
	
	private String periodUnit;
	
	private List<PromotionLanguageInfo> languages;
	
	private List<PromotionPriceInfo> promotionPrice;

	public String getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	public String getPromotionTitle() {
		return promotionTitle;
	}

	public void setPromotionTitle(String promotionTitle) {
		this.promotionTitle = promotionTitle;
	}

	public Integer getStartDate() {
		return startDate;
	}

	public void setStartDate(Integer startDate) {
		this.startDate = startDate;
	}

	public Integer getEndDate() {
		return endDate;
	}

	public void setEndDate(Integer endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Integer getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(Integer numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	public String getPeriodUnit() {
		return periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
	}

	public List<PromotionLanguageInfo> getLanguages() {
		return languages;
	}

	public void setLanguages(List<PromotionLanguageInfo> languages) {
		this.languages = languages;
	}

	public List<PromotionPriceInfo> getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(List<PromotionPriceInfo> promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	
	

}
