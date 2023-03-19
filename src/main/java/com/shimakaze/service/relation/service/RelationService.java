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
     * @param name
     * @param relation
     * @return
     */
    List<RelationDto> getRelations(String name, String relation);

    /**
     * 返回指定name的关系
     * @param name
     * @return
     */
    List<String> getRelationsWithoutRepetition(String name);
}
