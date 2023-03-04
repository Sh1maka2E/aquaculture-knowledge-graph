package com.shimakaze.service.relation.impl;

import com.shimakaze.entity.RelationList;
import com.shimakaze.entity.node.Field;
import com.shimakaze.entity.node.Preparation;
import com.shimakaze.entity.relation.PreparationBeforeStocking;
import com.shimakaze.repository.relation.PreparationBeforeStockingRepository;
import com.shimakaze.service.relation.PreparationBeforeStockingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PreparationBeforeStockingServiceImpl implements PreparationBeforeStockingService {

    @Autowired
    private PreparationBeforeStockingRepository preparationBeforeStockingRepository;

    @Override
    public List<RelationList> list() {
        List<RelationList> relationList = new ArrayList<>();
        List<PreparationBeforeStocking> preparationBeforeStockingList = preparationBeforeStockingRepository.getPreparationBeforeStockingList();
        for (PreparationBeforeStocking preparationBeforeStocking : preparationBeforeStockingList) {
            Field startNode = (Field) preparationBeforeStocking.getStartNode();
            Preparation endNode = (Preparation) preparationBeforeStocking.getEndNode();

            RelationList relation = new RelationList();
            relation.setStartNode(startNode.getName());
            relation.setEndNode(endNode.getName());
            relation.setRelation("放养前准备");
            relationList.add(relation);
        }
        return relationList;
    }
}
