package com.shimakaze.entity.node;

import com.shimakaze.entity.BaseNode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
/**
 * 准备标签实体类
 */

//label值必须与neo4j中的对应
@NodeEntity(label = "准备")
public class Preparation extends BaseNode {

	@Property
	private String handle;

	public Preparation(){}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

}
