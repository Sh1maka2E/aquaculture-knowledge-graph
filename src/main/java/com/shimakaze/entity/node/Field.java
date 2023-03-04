package com.shimakaze.entity.node;

import com.shimakaze.entity.BaseNode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
/**
 * 场地标签实体类
 */
//label值必须与neo4j中的对应
@NodeEntity(label = "场地")
public class Field extends BaseNode {

	@Property
	private String DrainageHoles;
	@Property
	private String WallThickness;
	@Property
	private String area;
	@Property
	private String depth;
	@Property
	private String disinfectWay;
	@Property
	private String intervalThickness;
	@Property
	private String waterLevel;
	@Property
	private String PH;
	@Property
	private String aspectRatio;
	@Property
	private String bottom;
	@Property
	private String changeWater;
	@Property
	private String controlPH;
	@Property
	private String management;
	@Property
	private String microecologicalRegulation;
	@Property
	private String siltThickness;
	@Property
	private String temperature;
	@Property
	private String waterPurification;

	public Field(){}

	public String getDrainageHoles() {
		return DrainageHoles;
	}

	public void setDrainageHoles(String drainageHoles) {
		DrainageHoles = drainageHoles;
	}

	public String getWallThickness() {
		return WallThickness;
	}

	public void setWallThickness(String wallThickness) {
		WallThickness = wallThickness;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getDisinfectWay() {
		return disinfectWay;
	}

	public void setDisinfectWay(String disinfectWay) {
		this.disinfectWay = disinfectWay;
	}

	public String getIntervalThickness() {
		return intervalThickness;
	}

	public void setIntervalThickness(String intervalThickness) {
		this.intervalThickness = intervalThickness;
	}

	public String getWaterLevel() {
		return waterLevel;
	}

	public void setWaterLevel(String waterLevel) {
		this.waterLevel = waterLevel;
	}

	public String getPH() {
		return PH;
	}

	public void setPH(String PH) {
		this.PH = PH;
	}

	public String getAspectRatio() {
		return aspectRatio;
	}

	public void setAspectRatio(String aspectRatio) {
		this.aspectRatio = aspectRatio;
	}

	public String getBottom() {
		return bottom;
	}

	public void setBottom(String bottom) {
		this.bottom = bottom;
	}

	public String getChangeWater() {
		return changeWater;
	}

	public void setChangeWater(String changeWater) {
		this.changeWater = changeWater;
	}

	public String getControlPH() {
		return controlPH;
	}

	public void setControlPH(String controlPH) {
		this.controlPH = controlPH;
	}

	public String getManagement() {
		return management;
	}

	public void setManagement(String management) {
		this.management = management;
	}

	public String getMicroecologicalRegulation() {
		return microecologicalRegulation;
	}

	public void setMicroecologicalRegulation(String microecologicalRegulation) {
		this.microecologicalRegulation = microecologicalRegulation;
	}

	public String getSiltThickness() {
		return siltThickness;
	}

	public void setSiltThickness(String siltThickness) {
		this.siltThickness = siltThickness;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getWaterPurification() {
		return waterPurification;
	}

	public void setWaterPurification(String waterPurification) {
		this.waterPurification = waterPurification;
	}
}
