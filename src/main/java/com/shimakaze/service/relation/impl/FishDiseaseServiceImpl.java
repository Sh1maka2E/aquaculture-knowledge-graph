package com.shimakaze.service.relation.impl;

import com.shimakaze.entity.RelationList;
import com.shimakaze.entity.node.AquaticProduct;
import com.shimakaze.entity.node.Disease;
import com.shimakaze.entity.relation.FishDisease;
import com.shimakaze.repository.relation.FishDiseaseRepository;
import com.shimakaze.service.relation.FishDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FishDiseaseServiceImpl implements FishDiseaseService {
    @Autowired
    private FishDiseaseRepository fishDiseaseRepository;

    @Override
    public List<RelationList> list() {
        List<RelationList> relationList = new ArrayList<>();
        List<FishDisease> fishDiseaseList = fishDiseaseRepository.getFishDiseaseList();
        for (FishDisease fishDisease : fishDiseaseList) {
            AquaticProduct startNode = (AquaticProduct) fishDisease.getStartNode();
            Disease endNode = (Disease) fishDisease.getEndNode();

            RelationList relation = new RelationList();
            relation.setStartNode(startNode.getName());
            relation.setEndNode(endNode.getName());
            relation.setRelation("草鱼可能患有的疾病");
            relationList.add(relation);
        }
        return relationList;
    }
}
