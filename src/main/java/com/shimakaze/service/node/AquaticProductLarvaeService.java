package com.shimakaze.service.node;

import com.shimakaze.pojo.node.AquaticProductLarvae;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:19:50
 */
public interface AquaticProductLarvaeService {
    // 查询所有节点
    List<AquaticProductLarvae> getNodes();

    // 查询所单个节点的属性
    AquaticProductLarvae getNode(String name);
}
