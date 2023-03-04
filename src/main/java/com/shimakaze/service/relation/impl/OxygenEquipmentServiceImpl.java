package com.shimakaze.service.relation.impl;

import com.shimakaze.entity.RelationList;
import com.shimakaze.entity.node.Equipment;
import com.shimakaze.entity.node.Field;
import com.shimakaze.entity.relation.OxygenEquipment;
import com.shimakaze.repository.relation.OxygenEquipmentRepository;
import com.shimakaze.service.relation.OxygenEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OxygenEquipmentServiceImpl implements OxygenEquipmentService {

    @Autowired
    private OxygenEquipmentRepository oxygenEquipmentRepository;

    @Override
    public List<RelationList> list() {
        List<RelationList> relationList = new ArrayList<>();
        List<OxygenEquipment> oxygenEquipmentList = oxygenEquipmentRepository.getOxygenEquipmentList();
        for (OxygenEquipment oxygenEquipment : oxygenEquipmentList) {
            Field startNode = (Field) oxygenEquipment.getStartNode();
            Equipment endNode = (Equipment) oxygenEquipment.getEndNode();

            RelationList relation = new RelationList();
            relation.setStartNode(startNode.getName());
            relation.setEndNode(endNode.getName());
            relation.setRelation("增氧设备");
            relationList.add(relation);
        }
        return relationList;
    }
}
