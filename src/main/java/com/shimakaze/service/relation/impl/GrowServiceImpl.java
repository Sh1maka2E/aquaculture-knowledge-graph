package com.shimakaze.service.relation.impl;

import com.shimakaze.entity.RelationList;
import com.shimakaze.entity.node.AquaticProduct;
import com.shimakaze.entity.node.AquaticProductLarva;
import com.shimakaze.entity.relation.Grow;
import com.shimakaze.repository.relation.GrowRepository;
import com.shimakaze.service.relation.GrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GrowServiceImpl implements GrowService {

    @Autowired
    private GrowRepository growRepository;

    @Override
    public List<RelationList> list() {
        List<RelationList> relationList = new ArrayList<>();
        List<Grow> growList_LarvaToLarva = growRepository.getGrowLarvaToLarvaList();
        for (Grow grow : growList_LarvaToLarva) {
            AquaticProductLarva startNode = (AquaticProductLarva) grow.getStartNode();
            AquaticProductLarva endNode = (AquaticProductLarva) grow.getEndNode();

            RelationList relation = new RelationList();
            relation.setStartNode(startNode.getName());
            relation.setEndNode(endNode.getName());
            relation.setRelation("成长");
            relationList.add(relation);
        }
        List<Grow> growList_LarvaToAdult = growRepository.getGrowLarvaToAdultList();
        for (Grow grow : growList_LarvaToAdult) {
            AquaticProductLarva startNode = (AquaticProductLarva) grow.getStartNode();
            AquaticProduct endNode = (AquaticProduct) grow.getEndNode();

            RelationList relation = new RelationList();
            relation.setStartNode(startNode.getName());
            relation.setEndNode(endNode.getName());
            relation.setRelation("成长");
            relationList.add(relation);
        }
        return relationList;
    }
}
