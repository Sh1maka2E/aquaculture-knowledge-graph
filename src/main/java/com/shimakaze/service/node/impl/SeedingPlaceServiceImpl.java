package com.shimakaze.service.node.impl;

import com.shimakaze.pojo.node.SeedingPlace;
import com.shimakaze.repository.node.SeedingPlaceRepository;
import com.shimakaze.service.node.SeedingPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:20:19
 */
@Service
public class SeedingPlaceServiceImpl implements SeedingPlaceService {

    @Autowired
    private SeedingPlaceRepository seedingPlaceRepository;

    /**
     * 查询所有节点
     * @return
     */
    @Override
    public List<SeedingPlace> getNodes() {
        return seedingPlaceRepository.getNodes();
    }


    /**
     * 查询单个节点的属性
     * @param name
     * @return
     */
    @Override
    public SeedingPlace getNode(String name) {
        return seedingPlaceRepository.getNode(name);
    }
}
