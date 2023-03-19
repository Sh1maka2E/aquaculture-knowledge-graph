package com.shimakaze.service.node.impl;

import com.shimakaze.pojo.node.AquaticProduct;
import com.shimakaze.repository.node.AquaticProductRepository;
import com.shimakaze.service.node.AquaticProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:20:19
 */
@Service
public class AquaticProductServiceImpl implements AquaticProductService {

    @Autowired
    private AquaticProductRepository aquaticProductRepository;

    /**
     * 查询所有节点
     * @return
     */
    @Override
    public List<AquaticProduct> getNodes() {
        return aquaticProductRepository.getNodes();
    }

    /**
     * 查询单个节点的属性
     * @param name
     * @return
     */
    @Override
    public AquaticProduct getNode(String name) {
        return aquaticProductRepository.getNode(name);
    }
}
