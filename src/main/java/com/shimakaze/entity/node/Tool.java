package com.shimakaze.entity.node;

import com.shimakaze.entity.BaseNode;
import org.neo4j.ogm.annotation.NodeEntity;
/**
 * 工具标签实体类
 */
//label值必须与neo4j中的对应
@NodeEntity(label = "工具")
public class Tool extends BaseNode {

	public Tool(){}

}
