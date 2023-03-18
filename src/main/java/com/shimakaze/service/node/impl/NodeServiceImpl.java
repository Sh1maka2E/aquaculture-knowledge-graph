package com.shimakaze.service.node.impl;

import com.shimakaze.service.node.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/19 01:12:14
 */
@Service
public class NodeServiceImpl implements NodeService {
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

    /**
     * 返回所有节点
     * @return
     */
    @Override
    public List<String> getHeads() {
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
}
