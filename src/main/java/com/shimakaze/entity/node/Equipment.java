package com.shimakaze.entity.node;

import com.shimakaze.entity.BaseNode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
/**
 * 设备标签实体类
 */
//label值必须与neo4j中的对应
@NodeEntity(label = "设备")
public class Equipment extends BaseNode {

	@Property
	private String addOxyDuration;
	@Property
	private String openTime;

	public Equipment(){}

	public String getAddOxyDuration() {
		return addOxyDuration;
	}

	public void setAddOxyDuration(String addOxyDuration) {
		this.addOxyDuration = addOxyDuration;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
}
