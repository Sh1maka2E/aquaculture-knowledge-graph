package com.shimakaze.service.relation.service.impl;

import com.shimakaze.common.RelationDto;
import com.shimakaze.service.relation.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/19 01:15:21
 */
@Service
public class RelationServiceImpl implements RelationService {

    @Autowired
    private EquipWithService equipWithService;

    @Autowired
    private FeedingService feedingService;

    @Autowired
    private GlowIntoService glowIntoService;

    @Autowired
    private LiveInService liveInService;

    @Autowired
    private MaySufferService maySufferService;

    @Autowired
    private RaisedInService raisedInService;

    /**
     * 返回所有关系，head和relation为可选项
     * @param name
     * @return
     */
    @Override
    public List<RelationDto> getRelations(String name, String relation) {
        List<RelationDto> list = new ArrayList<>();
        equipWithService.getRelations().forEach(list::add);
        feedingService.getRelations().forEach(list::add);
        glowIntoService.getRelations().forEach(list::add);
        liveInService.getRelations().forEach(list::add);
        maySufferService.getRelations().forEach(list::add);
        raisedInService.getRelations().forEach(list::add);
        if (name != null) {
            // 如果传递了name，则过滤出头节点或尾节点为name的关系
            list = list.stream()
                    .filter(relationDto -> name.equals(relationDto.getStartNode()) || name.equals(relationDto.getEndNode()))
                    .collect(Collectors.toList());
            if(relation != null) {
                // 如果传递了relation，则继续过滤出关系为relation的关系
                list = list.stream()
                        .filter(relationDto -> relation.equals(relationDto.getRelation()))
                        .collect(Collectors.toList());
            }
            return list;
        }
        return list;
    }

    /**
     * 返回指定head的所有关系（仅返回关系名称，关系不重复）
     * @param name
     * @return
     */
    @Override
    public List<String> getRelationsWithoutRepetition(String name) {
        List<RelationDto> list = new ArrayList<>();
        equipWithService.getRelations().forEach(list::add);
        feedingService.getRelations().forEach(list::add);
        glowIntoService.getRelations().forEach(list::add);
        liveInService.getRelations().forEach(list::add);
        maySufferService.getRelations().forEach(list::add);
        raisedInService.getRelations().forEach(list::add);

        return list.stream()
                // 过滤出头结点为head的关系
                .filter(relationDto -> name.equals(relationDto.getStartNode()))
                .map(RelationDto::getRelation)
                .distinct()
                .collect(Collectors.toList());
    }
}
