package com.shimakaze.entity.node;

import com.shimakaze.entity.BaseNode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
/**
 * 饵料标签实体类
 */
//label值必须与neo4j中的对应
@NodeEntity(label = "饵料")
public class Feed extends BaseNode {

	@Property
	private String type;

	public Feed(){}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
