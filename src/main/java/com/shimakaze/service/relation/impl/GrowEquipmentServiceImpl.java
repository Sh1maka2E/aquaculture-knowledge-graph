package com.shimakaze.service.relation.impl;

import com.shimakaze.entity.RelationList;
import com.shimakaze.entity.node.Equipment;
import com.shimakaze.entity.node.Field;
import com.shimakaze.entity.relation.GrowEquipment;
import com.shimakaze.repository.relation.GrowEquipmentRepository;
import com.shimakaze.service.relation.GrowEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GrowEquipmentServiceImpl implements GrowEquipmentService {
    @Autowired
    private GrowEquipmentRepository growEquipmentRepository;

    @Override
    public List<RelationList> list() {
        List<RelationList> relationList = new ArrayList<>();
        List<GrowEquipment> growEquipmentList = growEquipmentRepository.getGrowEquipmentList();
        for (GrowEquipment growEquipment : growEquipmentList) {
            Field startNode = (Field) growEquipment.getStartNode();
            Equipment endNode = (Equipment) growEquipment.getEndNode();

            RelationList relation = new RelationList();
            relation.setStartNode(startNode.getName());
            relation.setEndNode(endNode.getName());
            relation.setRelation("育苗设备");
            relationList.add(relation);
        }
        return relationList;
    }
}
