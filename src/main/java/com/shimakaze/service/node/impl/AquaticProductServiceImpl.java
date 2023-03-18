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


    @Override
    public List<AquaticProduct> getNodes() {
        return aquaticProductRepository.queryAll();
    }
}
