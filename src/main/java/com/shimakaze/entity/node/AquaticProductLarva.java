package com.shimakaze.entity.node;

import com.shimakaze.entity.BaseNode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * 水产品幼体标签实体类
 */
//label值必须与neo4j中的对应
@NodeEntity(label = "水产品幼体")
public class AquaticProductLarva extends BaseNode {


	@Property
	private String feedingAmount;
	@Property
	private String feedingTimes;
	@Property
	private String inflation;
	@Property
	private String waterChangeVolume;
	@Property
	private String cultivationDissolvedOxygen;
	@Property
	private String cultivationIllumination;
	@Property
	private String cultivationPH;
	@Property
	private String cultivationSalinity;
	@Property
	private String cultivationTemperature;
	@Property
	private String cultivationTime;
	@Property
	private String cultivationDensity;
	@Property
	private String collectionWay;

	public AquaticProductLarva(){}


	public String getFeedingAmount() {
		return feedingAmount;
	}

	public void setFeedingAmount(String feedingAmount) {
		this.feedingAmount = feedingAmount;
	}

	public String getFeedingTimes() {
		return feedingTimes;
	}

	public void setFeedingTimes(String feedingTimes) {
		this.feedingTimes = feedingTimes;
	}

	public String getInflation() {
		return inflation;
	}

	public void setInflation(String inflation) {
		this.inflation = inflation;
	}

	public String getWaterChangeVolume() {
		return waterChangeVolume;
	}

	public void setWaterChangeVolume(String waterChangeVolume) {
		this.waterChangeVolume = waterChangeVolume;
	}

	public String getCultivationDissolvedOxygen() {
		return cultivationDissolvedOxygen;
	}

	public void setCultivationDissolvedOxygen(String cultivationDissolvedOxygen) {
		this.cultivationDissolvedOxygen = cultivationDissolvedOxygen;
	}

	public String getCultivationIllumination() {
		return cultivationIllumination;
	}

	public void setCultivationIllumination(String cultivationIllumination) {
		this.cultivationIllumination = cultivationIllumination;
	}

	public String getCultivationPH() {
		return cultivationPH;
	}

	public void setCultivationPH(String cultivationPH) {
		this.cultivationPH = cultivationPH;
	}

	public String getCultivationSalinity() {
		return cultivationSalinity;
	}

	public void setCultivationSalinity(String cultivationSalinity) {
		this.cultivationSalinity = cultivationSalinity;
	}

	public String getCultivationTemperature() {
		return cultivationTemperature;
	}

	public void setCultivationTemperature(String cultivationTemperature) {
		this.cultivationTemperature = cultivationTemperature;
	}

	public String getCultivationTime() {
		return cultivationTime;
	}

	public void setCultivationTime(String cultivationTime) {
		this.cultivationTime = cultivationTime;
	}

	public String getCultivationDensity() {
		return cultivationDensity;
	}

	public void setCultivationDensity(String cultivationDensity) {
		this.cultivationDensity = cultivationDensity;
	}

	public String getCollectionWay() {
		return collectionWay;
	}

	public void setCollectionWay(String collectionWay) {
		this.collectionWay = collectionWay;
	}
}
