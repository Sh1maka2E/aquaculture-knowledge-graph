package com.shimakaze.service.node.impl;

import com.shimakaze.pojo.node.Habitat;
import com.shimakaze.repository.node.HabitatRepository;
import com.shimakaze.service.node.HabitatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:20:19
 */
@Service
public class HabitatServiceImpl implements HabitatService {

    @Autowired
    private HabitatRepository habitatRepository;

    /**
     * 查询所有节点
     * @return
     */
    @Override
    public List<Habitat> getNodes() {
        return habitatRepository.getNodes();
    }


    /**
     * 查询单个节点的属性
     * @param name
     * @return
     */
    @Override
    public Habitat getNode(String name) {
        return habitatRepository.getNode(name);
    }
}
