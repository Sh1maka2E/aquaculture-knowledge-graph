package com.shimakaze.service.relation.service.impl;

import com.shimakaze.common.RelationDto;
import com.shimakaze.repository.relation.FeedingRepository;
import com.shimakaze.service.relation.service.FeedingService;
import com.shimakaze.utils.GetAnnotationNameUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:34:57
 */
@Service
public class FeedingServiceImpl implements FeedingService {
    @Autowired
    private FeedingRepository FeedingRepository;

    /**
     * 查询关系，仅返回头节点、尾节点、关系的名称
     * @return
     */
    @Override
    public List<RelationDto> getRelations() {
        List<RelationDto> list = new ArrayList<>();
        FeedingRepository.getRelations().forEach(relation -> {
            RelationDto relationDto = new RelationDto();
            relationDto.setStartNode(relation.getStartNode().getName());
            // 使用工具类获取关系类注解（即名称）并赋给relation
            relationDto.setRelation(GetAnnotationNameUtil.getRelationName(relation.getClass()));
            relationDto.setEndNode(relation.getEndNode().getName());
            list.add(relationDto);
        });
        return list;
    }

    /**
     * 查询带有head的关系，仅返回头节点、尾节点、关系的名称
     * @param head
     * @return
     */
    @Override
    public List<RelationDto> getRelations(String head) {
        List<RelationDto> list = new ArrayList<>();
        FeedingRepository.getRelations(head).forEach(relation -> {
            RelationDto relationDto = new RelationDto();
            relationDto.setStartNode(head);
            // 使用工具类获取关系类注解（即名称）并赋给relation
            relationDto.setRelation(GetAnnotationNameUtil.getRelationName(relation.getClass()));
            relationDto.setEndNode(relation.getEndNode().getName());
            list.add(relationDto);
        });
        return list;
    }
}
