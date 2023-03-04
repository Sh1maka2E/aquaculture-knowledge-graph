package com.shimakaze.service.relation.impl;

import com.shimakaze.entity.RelationList;
import com.shimakaze.entity.node.AquaticProductLarva;
import com.shimakaze.entity.node.Feed;
import com.shimakaze.entity.relation.Feeding;
import com.shimakaze.repository.relation.FeedingRepository;
import com.shimakaze.service.relation.FeedingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeedingServiceImpl implements FeedingService {

    @Autowired
    private FeedingRepository feedingRepository;

    @Override
    public List<RelationList> list() {
        List<RelationList> relationList = new ArrayList<>();
        List<Feeding> feedingList = feedingRepository.getFeedingList();
        for (Feeding feeding : feedingList) {
            AquaticProductLarva startNode = (AquaticProductLarva) feeding.getStartNode();
            Feed endNode = (Feed) feeding.getEndNode();

            RelationList relation = new RelationList();
            relation.setStartNode(startNode.getName());
            relation.setEndNode(endNode.getName());
            relation.setRelation("饲养饵料");
            relationList.add(relation);
        }
        return relationList;
    }
}
