package com.shimakaze.controller;

import com.shimakaze.entity.Relation;
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
@RequestMapping("/relation")
public class RelationController {

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
     * 根据head查询relation
     * @return
     */
    @GetMapping("/getRelations")
    public List<Relation> getRelations(@RequestParam(value = "head") String head){
        //将所有关系加进relationList
        if(head == null) return null;
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

        //遍历relationList的所有关系，若开始结点或结束结点为传递的head，就把关系属性就加进resultRelationList（不用添加重复的关系）
        List<String> resultRelationList = new ArrayList<>();

        for(RelationList relation : relationList){
            String _relation = relation.getRelation();
            if(!resultRelationList.contains(_relation) && (relation.getStartNode().equals(head) || relation.getEndNode().equals(head))){
                resultRelationList.add(_relation);

            }
        }

        List<Relation> relations = new ArrayList<>();
        for(String s : resultRelationList){
            Relation relation = new Relation();
            relation.setName(s);
            relations.add(relation);
        }
        return relations;
    }
}
