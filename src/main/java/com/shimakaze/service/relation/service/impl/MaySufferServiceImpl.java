package com.shimakaze.service.relation.service.impl;

import com.shimakaze.common.CommonNode;
import com.shimakaze.common.RelationDto;
import com.shimakaze.pojo.relation.MaySuffer;
import com.shimakaze.repository.relation.MaySufferRepository;
import com.shimakaze.service.relation.service.MaySufferService;
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
public class MaySufferServiceImpl implements MaySufferService {
    @Autowired
    private MaySufferRepository maySufferRepository;


    @Override
    public List<RelationDto> getRelations() {
        List<RelationDto> list = new ArrayList<>();
        maySufferRepository.getRelations().forEach(relation -> {
            RelationDto relationDto = new RelationDto();
            relationDto.setStartNode(relation.getStartNode().getName());
            relationDto.setRelation(GetAnnotationNameUtil.getRelationName(relation.getClass()));
            relationDto.setEndNode(relation.getEndNode().getName());
            list.add(relationDto);
        });
        return list;
    }

    @Override
    public List<RelationDto> getRelations(String head) {
        List<RelationDto> list = new ArrayList<>();
        maySufferRepository.getRelations(head).forEach(relation -> {
            RelationDto relationDto = new RelationDto();
            relationDto.setStartNode(head);
            relationDto.setRelation(GetAnnotationNameUtil.getRelationName(relation.getClass()));
            relationDto.setEndNode(relation.getEndNode().getName());
            list.add(relationDto);
        });
        return list;
    }
}
