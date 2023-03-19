package com.shimakaze.service.node.impl;

import com.shimakaze.pojo.node.AquaticProduct;
import com.shimakaze.repository.node.NodeRepository;
import com.shimakaze.service.node.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/19 01:12:14
 */
@Slf4j
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

    @Autowired
    private NodeRepository nodeRepository;

    /**
     * 查询所有节点
     *
     * @return
     */
    @Override
    public List<String> getNodes() {
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

    /**
     * 查询节点的标签
     *
     * @param name
     * @return
     */
    @Override
    public String getLabel(String name) {
        return nodeRepository.getLabel(name);
    }

    @Override
    public Object getNode(String name) {
        // 查询节点的标签
        String label = getLabel(name);
        Object object = new Object();
        // 根据标签创建不同标签类型的实体
        if ("水产品幼体".equals(label)) {
            object = aquaticProductLarvaeService.getNode(name);
        } else if ("水产品".equals(label)) {
            object = aquaticProductService.getNode(name);
        } else if ("疾病".equals(label)) {
            object = diseaseService.getNode(name);
        } else if ("池塘设备".equals(label)) {
            object = equipmentService.getNode(name);
        } else if ("饲养饵料".equals(label)) {
            object = feedService.getNode(name);
        } else if ("栖息地".equals(label)) {
            object = habitatService.getNode(name);
        } else if ("育苗场地".equals(label)) {
            object = seedingPlaceService.getNode(name);
        }
        return object;
    }
}
