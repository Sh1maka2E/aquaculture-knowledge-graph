package com.shimakaze.service.relation.impl;

import com.shimakaze.entity.RelationList;
import com.shimakaze.entity.node.AquaticProduct;
import com.shimakaze.entity.node.Field;
import com.shimakaze.entity.relation.GrowField;
import com.shimakaze.repository.relation.GrowFieldRepository;
import com.shimakaze.service.relation.GrowFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GrowFieldServiceImpl implements GrowFieldService {
    @Autowired
    private GrowFieldRepository growFieldRepository;

    @Override
    public List<RelationList> list() {
        List<RelationList> relationList = new ArrayList<>();
        List<GrowField> growFieldList = growFieldRepository.getGrowFieldList();
        for (GrowField growField : growFieldList) {
            AquaticProduct startNode = (AquaticProduct) growField.getStartNode();
            Field endNode = (Field) growField.getEndNode();

            RelationList relation = new RelationList();
            relation.setStartNode(startNode.getName());
            relation.setEndNode(endNode.getName());
            relation.setRelation("育苗场地");
            relationList.add(relation);
        }
        return relationList;
    }
}
