package com.shimakaze.entity.node;

import com.shimakaze.entity.BaseNode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * 疾病标签实体类
 */
//label值必须与neo4j中的对应
@NodeEntity(label = "疾病")
public class Disease extends BaseNode {

	@Property
	private String incentive;
	@Property
	private String pathogen;
	@Property
	private String preventionAndCure;
	@Property
	private String symptom;
	@Property
	private String type;
	@Property
	private String season;
	@Property
	private String onsetOfIllness;
	@Property
	private String prophylaxis;
	@Property
	private String treat;

	public Disease(){}

	public String getIncentive() {
		return incentive;
	}

	public void setIncentive(String incentive) {
		this.incentive = incentive;
	}

	public String getPathogen() {
		return pathogen;
	}

	public void setPathogen(String pathogen) {
		this.pathogen = pathogen;
	}

	public String getPreventionAndCure() {
		return preventionAndCure;
	}

	public void setPreventionAndCure(String preventionAndCure) {
		this.preventionAndCure = preventionAndCure;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getOnsetOfIllness() {
		return onsetOfIllness;
	}

	public void setOnsetOfIllness(String onsetOfIllness) {
		this.onsetOfIllness = onsetOfIllness;
	}

	public String getProphylaxis() {
		return prophylaxis;
	}

	public void setProphylaxis(String prophylaxis) {
		this.prophylaxis = prophylaxis;
	}

	public String getTreat() {
		return treat;
	}

	public void setTreat(String treat) {
		this.treat = treat;
	}
}
