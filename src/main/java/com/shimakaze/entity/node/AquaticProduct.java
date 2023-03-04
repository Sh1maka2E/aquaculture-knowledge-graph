package com.shimakaze.entity.node;

import com.shimakaze.entity.BaseNode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * 水产品标签实体类
 */
//label值必须与neo4j中的对应
@NodeEntity(label = "水产品")
public class AquaticProduct extends BaseNode {

	@Property
	private String breedingSeason;
	@Property
	private String commonName;
	@Property
	private String cultivationBait;
	@Property
	private String cultivationDensity;
	@Property
	private String cultivationDissolvedOxy;
	@Property
	private String cultivationFeedAmount;
	@Property
	private String cultivationFeedTimes;
	@Property
	private String cultivationIllumination;
	@Property
	private String cultivationMaleFemaleRatio;
	@Property
	private String cultivationSalinity;
	@Property
	private String cultivationSelection;
	@Property
	private String cultivationTemperature;
	@Property
	private String naturalHabitat;
	@Property
	private String promoteRipeningCultivationBait;
	@Property
	private String promoteRipeningCultivationDensity;
	@Property
	private String promoteRipeningCultivationFeedAmount;
	@Property
	private String promoteRipeningCultivationFeedTimes;
	@Property
	private String promoteRipeningCultivationSalinity;
	@Property
	private String promoteRipeningCultivationTemperature;
	@Property
	private String promoteRipeningCultivationWaterDepth;
	@Property
	private String promoteRipeningCultivationWay;
	@Property
	private String catchTime;
	@Property
	private String eachFeeding;
	@Property
	private String feature;
	@Property
	private String feedingTime;
	@Property
	private String feedintTimes;
	@Property
	private String fishChooseRequest;
	@Property
	private String fishDisinfec;
	@Property
	private String fishStocking;
	@Property
	private String fishStockingNum;
	@Property
	private String fodder;
	@Property
	private String stockingTime;

	public AquaticProduct(){}

	public String getBreedingSeason() {
		return breedingSeason;
	}

	public void setBreedingSeason(String breedingSeason) {
		this.breedingSeason = breedingSeason;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getCultivationBait() {
		return cultivationBait;
	}

	public void setCultivationBait(String cultivationBait) {
		this.cultivationBait = cultivationBait;
	}

	public String getCultivationDensity() {
		return cultivationDensity;
	}

	public void setCultivationDensity(String cultivationDensity) {
		this.cultivationDensity = cultivationDensity;
	}

	public String getCultivationDissolvedOxy() {
		return cultivationDissolvedOxy;
	}

	public void setCultivationDissolvedOxy(String cultivationDissolvedOxy) {
		this.cultivationDissolvedOxy = cultivationDissolvedOxy;
	}

	public String getCultivationFeedAmount() {
		return cultivationFeedAmount;
	}

	public void setCultivationFeedAmount(String cultivationFeedAmount) {
		this.cultivationFeedAmount = cultivationFeedAmount;
	}

	public String getCultivationFeedTimes() {
		return cultivationFeedTimes;
	}

	public void setCultivationFeedTimes(String cultivationFeedTimes) {
		this.cultivationFeedTimes = cultivationFeedTimes;
	}

	public String getCultivationIllumination() {
		return cultivationIllumination;
	}

	public void setCultivationIllumination(String cultivationIllumination) {
		this.cultivationIllumination = cultivationIllumination;
	}

	public String getCultivationMaleFemaleRatio() {
		return cultivationMaleFemaleRatio;
	}

	public void setCultivationMaleFemaleRatio(String cultivationMaleFemaleRatio) {
		this.cultivationMaleFemaleRatio = cultivationMaleFemaleRatio;
	}

	public String getCultivationSalinity() {
		return cultivationSalinity;
	}

	public void setCultivationSalinity(String cultivationSalinity) {
		this.cultivationSalinity = cultivationSalinity;
	}

	public String getCultivationSelection() {
		return cultivationSelection;
	}

	public void setCultivationSelection(String cultivationSelection) {
		this.cultivationSelection = cultivationSelection;
	}

	public String getCultivationTemperature() {
		return cultivationTemperature;
	}

	public void setCultivationTemperature(String cultivationTemperature) {
		this.cultivationTemperature = cultivationTemperature;
	}

	public String getNaturalHabitat() {
		return naturalHabitat;
	}

	public void setNaturalHabitat(String naturalHabitat) {
		this.naturalHabitat = naturalHabitat;
	}

	public String getPromoteRipeningCultivationBait() {
		return promoteRipeningCultivationBait;
	}

	public void setPromoteRipeningCultivationBait(String promoteRipeningCultivationBait) {
		this.promoteRipeningCultivationBait = promoteRipeningCultivationBait;
	}

	public String getPromoteRipeningCultivationDensity() {
		return promoteRipeningCultivationDensity;
	}

	public void setPromoteRipeningCultivationDensity(String promoteRipeningCultivationDensity) {
		this.promoteRipeningCultivationDensity = promoteRipeningCultivationDensity;
	}

	public String getPromoteRipeningCultivationFeedAmount() {
		return promoteRipeningCultivationFeedAmount;
	}

	public void setPromoteRipeningCultivationFeedAmount(String promoteRipeningCultivationFeedAmount) {
		this.promoteRipeningCultivationFeedAmount = promoteRipeningCultivationFeedAmount;
	}

	public String getPromoteRipeningCultivationFeedTimes() {
		return promoteRipeningCultivationFeedTimes;
	}

	public void setPromoteRipeningCultivationFeedTimes(String promoteRipeningCultivationFeedTimes) {
		this.promoteRipeningCultivationFeedTimes = promoteRipeningCultivationFeedTimes;
	}

	public String getPromoteRipeningCultivationSalinity() {
		return promoteRipeningCultivationSalinity;
	}

	public void setPromoteRipeningCultivationSalinity(String promoteRipeningCultivationSalinity) {
		this.promoteRipeningCultivationSalinity = promoteRipeningCultivationSalinity;
	}

	public String getPromoteRipeningCultivationTemperature() {
		return promoteRipeningCultivationTemperature;
	}

	public void setPromoteRipeningCultivationTemperature(String promoteRipeningCultivationTemperature) {
		this.promoteRipeningCultivationTemperature = promoteRipeningCultivationTemperature;
	}

	public String getPromoteRipeningCultivationWaterDepth() {
		return promoteRipeningCultivationWaterDepth;
	}

	public void setPromoteRipeningCultivationWaterDepth(String promoteRipeningCultivationWaterDepth) {
		this.promoteRipeningCultivationWaterDepth = promoteRipeningCultivationWaterDepth;
	}

	public String getPromoteRipeningCultivationWay() {
		return promoteRipeningCultivationWay;
	}

	public void setPromoteRipeningCultivationWay(String promoteRipeningCultivationWay) {
		this.promoteRipeningCultivationWay = promoteRipeningCultivationWay;
	}

	public String getCatchTime() {
		return catchTime;
	}

	public void setCatchTime(String catchTime) {
		this.catchTime = catchTime;
	}

	public String getEachFeeding() {
		return eachFeeding;
	}

	public void setEachFeeding(String eachFeeding) {
		this.eachFeeding = eachFeeding;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getFeedingTime() {
		return feedingTime;
	}

	public void setFeedingTime(String feedingTime) {
		this.feedingTime = feedingTime;
	}

	public String getFeedintTimes() {
		return feedintTimes;
	}

	public void setFeedintTimes(String feedintTimes) {
		this.feedintTimes = feedintTimes;
	}

	public String getFishChooseRequest() {
		return fishChooseRequest;
	}

	public void setFishChooseRequest(String fishChooseRequest) {
		this.fishChooseRequest = fishChooseRequest;
	}

	public String getFishDisinfec() {
		return fishDisinfec;
	}

	public void setFishDisinfec(String fishDisinfec) {
		this.fishDisinfec = fishDisinfec;
	}

	public String getFishStocking() {
		return fishStocking;
	}

	public void setFishStocking(String fishStocking) {
		this.fishStocking = fishStocking;
	}

	public String getFishStockingNum() {
		return fishStockingNum;
	}

	public void setFishStockingNum(String fishStockingNum) {
		this.fishStockingNum = fishStockingNum;
	}

	public String getFodder() {
		return fodder;
	}

	public void setFodder(String fodder) {
		this.fodder = fodder;
	}

	public String getStockingTime() {
		return stockingTime;
	}

	public void setStockingTime(String stockingTime) {
		this.stockingTime = stockingTime;
	}
}
