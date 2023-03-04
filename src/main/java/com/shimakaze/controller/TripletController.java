package com.shimakaze.controller;


import com.shimakaze.entity.RelationList;
import com.shimakaze.service.relation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/triplet")
public class TripletController {

    @Autowired
    private FeedingService feedingService;
    @Autowired
    private FishDiseaseService fishDiseaseService;
    @Autowired
    private GrowEquipmentService growEquipmentService;
    @Autowired
    private GrowFieldService growFieldService;
    @Autowired
    private GrowService growService;
    @Autowired
    private GrowToolService growToolService;
    @Autowired
    private OxygenEquipmentService oxygenEquipmentService;
    @Autowired
    private PoolOutfitService poolOutfitService;
    @Autowired
    private PreparationBeforeStockingService preparationBeforeStockingService;
    @Autowired
    private ShrimpDiseaseService shrimpDiseaseService;


    /**
     * 根据head和relation查询结果
     * @return
     */
    @GetMapping("/getTriplet")
    public List<RelationList> getTriplet(@RequestParam(value = "head") String head, @RequestParam(value = "relation") String relation){
        List<RelationList> relationList = new ArrayList<>();
        relationList.addAll(feedingService.list());
        relationList.addAll(fishDiseaseService.list());
        relationList.addAll(growEquipmentService.list());
        relationList.addAll(growFieldService.list());
        relationList.addAll(growService.list());
        relationList.addAll(growToolService.list());
        relationList.addAll(oxygenEquipmentService.list());
        relationList.addAll(poolOutfitService.list());
        relationList.addAll(preparationBeforeStockingService.list());
        relationList.addAll(shrimpDiseaseService.list());

        List<RelationList> resultRelationListList = new ArrayList<>();

        //开始节点或结束节点为传递的head，并且关系为传递的relation就是想要的三元组
        for(RelationList _relationList : relationList){
            if((_relationList.getStartNode().equals(head) || _relationList.getEndNode().equals(head)) && _relationList.getRelation().equals(relation)){
                resultRelationListList.add(_relationList);
            }
        }
        return resultRelationListList;
    }
}
