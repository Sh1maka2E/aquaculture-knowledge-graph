package com.shimakaze.service.relation.impl;

import com.shimakaze.entity.RelationList;
import com.shimakaze.entity.node.Field;
import com.shimakaze.entity.node.Outfit;
import com.shimakaze.entity.relation.PoolOutfit;
import com.shimakaze.repository.relation.PoolOutfitRepository;
import com.shimakaze.service.relation.PoolOutfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PoolOutfitServiceImpl implements PoolOutfitService {

    @Autowired
    private PoolOutfitRepository poolOutfitRepository;

    @Override
    public List<RelationList> list() {
        List<RelationList> relationList = new ArrayList<>();
        List<PoolOutfit> poolOutfitList = poolOutfitRepository.getPoolEquipmentList();
        for (PoolOutfit poolOutfit : poolOutfitList) {
            Field startNode = (Field) poolOutfit.getStartNode();
            Outfit endNode = (Outfit) poolOutfit.getEndNode();

            RelationList relation = new RelationList();
            relation.setStartNode(startNode.getName());
            relation.setEndNode(endNode.getName());
            relation.setRelation("池塘配备");
            relationList.add(relation);
        }
        return relationList;
    }
}
