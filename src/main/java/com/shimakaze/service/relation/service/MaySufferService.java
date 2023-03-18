package com.shimakaze.service.relation.service;


import com.shimakaze.common.CommonNode;
import com.shimakaze.common.RelationDto;
import com.shimakaze.pojo.relation.MaySuffer;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:35:08
 */
public interface MaySufferService{
    // 查询关系，仅返回头节点、尾节点、关系的名称
    List<RelationDto> getRelations();

    // 查询带有head的关系，仅返回头节点、尾节点、关系的名称
    List<RelationDto> getRelations(String head);
}
