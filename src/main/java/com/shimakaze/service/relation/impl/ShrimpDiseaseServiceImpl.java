package com.shimakaze.service.relation.impl;

import com.shimakaze.entity.RelationList;
import com.shimakaze.entity.node.AquaticProduct;
import com.shimakaze.entity.node.Disease;
import com.shimakaze.entity.relation.ShrimpDisease;
import com.shimakaze.repository.relation.ShrimpDiseaseRepository;
import com.shimakaze.service.relation.ShrimpDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShrimpDiseaseServiceImpl implements ShrimpDiseaseService {
    @Autowired
    private ShrimpDiseaseRepository shrimpDiseaseRepository;

    @Override
    public List<RelationList> list() {
        List<RelationList> relationList = new ArrayList<>();
        List<ShrimpDisease> shrimpDiseaseList = shrimpDiseaseRepository.getShrimpDiseaseList();
        for (ShrimpDisease shrimpDisease : shrimpDiseaseList) {
            AquaticProduct startNode = (AquaticProduct) shrimpDisease.getStartNode();
            Disease endNode = (Disease) shrimpDisease.getEndNode();

            RelationList relation = new RelationList();
            relation.setStartNode(startNode.getName());
            relation.setEndNode(endNode.getName());
            relation.setRelation("南美白对虾可能患有的疾病");
            relationList.add(relation);
        }
        return relationList;
    }
}
