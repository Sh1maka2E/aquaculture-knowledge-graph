package com.shimakaze.entity.relation;

import com.shimakaze.entity.BaseNode;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * 育苗设备关系实体类
 */
//type值必须与neo4j中的对应
@RelationshipEntity(type = "育苗设备")
public class GrowEquipment {

	@GraphId
	private Long id;

	@StartNode
	private BaseNode startNode;

	@EndNode
	private BaseNode endNode;


	public GrowEquipment() {
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
