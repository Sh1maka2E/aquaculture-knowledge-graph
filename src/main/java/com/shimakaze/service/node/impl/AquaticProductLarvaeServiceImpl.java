package com.shimakaze.service.node.impl;

import com.shimakaze.pojo.node.AquaticProductLarvae;
import com.shimakaze.repository.node.AquaticProductLarvaeRepository;
import com.shimakaze.service.node.AquaticProductLarvaeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:20:19
 */
@Service
public class AquaticProductLarvaeServiceImpl implements AquaticProductLarvaeService {

    @Autowired
    private AquaticProductLarvaeRepository aquaticProductLarvaeRepository;

    /**
     * 查询所有节点
     * @return
     */
    @Override
    public List<AquaticProductLarvae> getNodes() {
        return aquaticProductLarvaeRepository.getNodes();
    }

    /**
     * 查询单个节点的属性
     * @param name
     * @return
     */
    @Override
    public AquaticProductLarvae getNode(String name) {
        return aquaticProductLarvaeRepository.getNode(name);
    }
}
