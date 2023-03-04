package com.shimakaze.entity.relation;

import com.shimakaze.entity.BaseNode;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * 增氧设备关系实体类
 */

//type值必须与neo4j中的对应
@RelationshipEntity(type = "增氧设备")
public class OxygenEquipment {

	@GraphId
	private Long id;

	@StartNode
	private BaseNode startNode;

	@EndNode
	private BaseNode endNode;


	public OxygenEquipment() {
	}
	public BaseNode getStartNode() {
		return startNode;
	}

	public void setStartNode(BaseNode startNode) {
		this.startNode = startNode;
	}

	public BaseNode getEndNode() {
		return endNode;
	}

	public void setEndNode(BaseNode endNode) {
		this.endNode = endNode;
	}
	
}
