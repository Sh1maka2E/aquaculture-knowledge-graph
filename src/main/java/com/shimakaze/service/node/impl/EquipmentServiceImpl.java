package com.shimakaze.service.node.impl;

import com.shimakaze.pojo.node.Equipment;
import com.shimakaze.repository.node.EquipmentRepository;
import com.shimakaze.service.node.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:20:19
 */
@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    private EquipmentRepository equipmentRepository;

    /**
     * 查询所有节点
     * @return
     */
    @Override
    public List<Equipment> getNodes() {
        return equipmentRepository.getNodes();
    }


    /**
     * 查询单个节点的属性
     * @param name
     * @return
     */
    @Override
    public Equipment getNode(String name) {
        return equipmentRepository.getNode(name);
    }
}
