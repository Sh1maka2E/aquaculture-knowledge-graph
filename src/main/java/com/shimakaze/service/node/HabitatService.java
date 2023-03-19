package com.shimakaze.service.node;

import com.shimakaze.pojo.node.Habitat;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:19:50
 */
public interface HabitatService {
    // 查询所有节点
    List<Habitat> getNodes();

    // 查询单个节点的属性
    Habitat getNode(String name);
}
