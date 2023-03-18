package com.shimakaze.controller;

import com.shimakaze.common.RelationDto;
import com.shimakaze.pojo.relation.GlowInto;
import com.shimakaze.service.node.*;
import com.shimakaze.service.relation.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.relation.Relation;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:22:12
 */
@RestController
@RequestMapping("/neo4j")
public class Neo4jController {
    @Autowired
    private AquaticProductService aquaticProductService;

    @Autowired
    private AquaticProductLarvaeService aquaticProductLarvaeService;

    @Autowired
    private DiseaseService diseaseService;

    @Autowired
    private EquipmentService equipmentService;

    @Autowired
    private FeedService feedService;

    @Autowired
    private HabitatService habitatService;

    @Autowired
    private SeedingPlaceService seedingPlaceService;

    @Autowired
    private EquipWithService equipWithService;

    @Autowired
    private FeedingService feedingService;

    @Autowired
    private GlowIntoService glowIntoService;

    @Autowired
    private LiveInService liveInService;

    @Autowired
    private MaySufferService maySufferService;

    @Autowired
    private RaisedInService raisedInService;


    @GetMapping("/getHeads")
    public List<String> getHeads(){
        List<String> list = new ArrayList<>();
        aquaticProductService.getNodes().forEach(node -> list.add(node.getName()));
        aquaticProductLarvaeService.getNodes().forEach(node -> list.add(node.getName()));
        diseaseService.getNodes().forEach(node -> list.add(node.getName()));
        equipmentService.getNodes().forEach(node -> list.add(node.getName()));
        feedService.getNodes().forEach(node -> list.add(node.getName()));
        habitatService.getNodes().forEach(node -> list.add(node.getName()));
        seedingPlaceService.getNodes().forEach(node -> list.add(node.getName()));
        return list;
    }

    @GetMapping(value = {"/getRelations", "/getRelations/{head}"})
    public List<RelationDto> getRelations(@PathVariable(required = false, value = "head") String head){
        List<RelationDto> list = new ArrayList<>();
        equipWithService.getRelations().forEach(list::add);
        feedingService.getRelations().forEach(list::add);
        glowIntoService.getRelations().forEach(list::add);
        liveInService.getRelations().forEach(list::add);
        maySufferService.getRelations().forEach(list::add);
        raisedInService.getRelations().forEach(list::add);
        if (head != null) {
            return list.stream()
                    .filter(relationDto -> head.equals(relationDto.getStartNode()) || head.equals(relationDto.getEndNode()))
                    .collect(Collectors.toList());
        }
        return list;
    }
}
