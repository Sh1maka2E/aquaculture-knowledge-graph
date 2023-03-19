package com.shimakaze.service.node.impl;

import com.shimakaze.pojo.node.Disease;
import com.shimakaze.repository.node.DiseaseRepository;
import com.shimakaze.service.node.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:20:19
 */
@Service
public class DiseaseServiceImpl implements DiseaseService {

    @Autowired
    private DiseaseRepository diseaseRepository;

    /**
     * 查询所有节点
     * @return
     */
    @Override
    public List<Disease> getNodes() {
        return diseaseRepository.getNodes();
    }


    /**
     * 查询单个节点的属性
     * @param name
     * @return
     */
    @Override
    public Disease getNode(String name) {
        return diseaseRepository.getNode(name);
    }
}
