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
     * 返回所有关系，head为可选项
     * @param head
     * @return
     */
    @Override
    public List<RelationDto> getRelations(String head) {
        List<RelationDto> list = new ArrayList<>();
        equipWithService.getRelations().forEach(list::add);
        feedingService.getRelations().forEach(list::add);
        glowIntoService.getRelations().forEach(list::add);
        liveInService.getRelations().forEach(list::add);
        maySufferService.getRelations().forEach(list::add);
        raisedInService.getRelations().forEach(list::add);
        if (head != null) {
            return list.stream()
                    .filter(relationDto -> head.equals(relationDto.getStartNode()) || head.equals(relationDto.getEndNode()))
                    .collect(Collectors.toList());
        }
        return list;
    }

    /**
     * 返回指定head的所有关系（仅返回关系名称，关系不重复）
     * @param head
     * @return
     */
    @Override
    public List<String> getRelationsByHead(String head) {
        List<RelationDto> list = new ArrayList<>();
        equipWithService.getRelations().forEach(list::add);
        feedingService.getRelations().forEach(list::add);
        glowIntoService.getRelations().forEach(list::add);
        liveInService.getRelations().forEach(list::add);
        maySufferService.getRelations().forEach(list::add);
        raisedInService.getRelations().forEach(list::add);

        return list.stream()
                .filter(relationDto -> head.equals(relationDto.getStartNode()))
                .map(RelationDto::getRelation)
                .distinct()
                .collect(Collectors.toList());
    }
}
