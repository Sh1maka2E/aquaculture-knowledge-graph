package com.shimakaze.service.relation.service.impl;

import com.shimakaze.common.RelationDto;
import com.shimakaze.repository.relation.EquipWithRepository;
import com.shimakaze.service.relation.service.EquipWithService;
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
public class EquipWithServiceImpl implements EquipWithService {
    @Autowired
    private EquipWithRepository EquipWithRepository;


    @Override
    public List<RelationDto> getRelations() {
        List<RelationDto> list = new ArrayList<>();
        EquipWithRepository.getRelations().forEach(relation -> {
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
        EquipWithRepository.getRelations(head).forEach(relation -> {
            RelationDto relationDto = new RelationDto();
            relationDto.setStartNode(head);
            relationDto.setRelation(GetAnnotationNameUtil.getRelationName(relation.getClass()));
            relationDto.setEndNode(relation.getEndNode().getName());
            list.add(relationDto);
        });
        return list;
    }
}
