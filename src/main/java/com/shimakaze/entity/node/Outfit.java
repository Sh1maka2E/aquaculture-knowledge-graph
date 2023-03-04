package com.shimakaze.entity.node;

import com.shimakaze.entity.BaseNode;
import org.neo4j.ogm.annotation.NodeEntity;
/**
 * 配备标签实体类
 */
//label值必须与neo4j中的对应
@NodeEntity(label = "配备")
public class Outfit extends BaseNode {

	public Outfit(){}

}
