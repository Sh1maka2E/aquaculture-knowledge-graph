package com.shimakaze.service.relation.impl;

import com.shimakaze.entity.RelationList;
import com.shimakaze.entity.node.AquaticProduct;
import com.shimakaze.entity.node.Tool;
import com.shimakaze.entity.relation.GrowTool;
import com.shimakaze.repository.relation.GrowToolRepository;
import com.shimakaze.service.relation.GrowToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GrowToolServiceImpl implements GrowToolService {
    @Autowired
    private GrowToolRepository growToolRepository;

    @Override
    public List<RelationList> list() {
        List<RelationList> relationList = new ArrayList<>();
        List<GrowTool> growToolList = growToolRepository.getGrowToolList();
        for (GrowTool growTool : growToolList) {
            AquaticProduct startNode = (AquaticProduct) growTool.getStartNode();
            Tool endNode = (Tool) growTool.getEndNode();

            RelationList relation = new RelationList();
            relation.setStartNode(startNode.getName());
            relation.setEndNode(endNode.getName());
            relation.setRelation("育苗工具");
            relationList.add(relation);
        }
        return relationList;
    }
}
