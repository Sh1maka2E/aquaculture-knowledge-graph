package com.shimakaze.service.relation.service;

import com.shimakaze.common.RelationDto;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/19 01:14:02
 */
public interface RelationService {
    /**
     * 返回所有关系
     * @param head
     * @return
     */
    List<RelationDto> getRelations(String head);

    /**
     * 返回指定head的关系
     * @param head
     * @return
     */
    List<String> getRelationsByHead(String head);
}
