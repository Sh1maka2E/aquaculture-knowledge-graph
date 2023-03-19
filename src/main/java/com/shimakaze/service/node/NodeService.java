package com.shimakaze.service.node;

import com.shimakaze.pojo.node.AquaticProduct;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/19 01:11:17
 */
public interface NodeService {
    /**
     * 查询所有节点
     * @return
     */
    List<String> getNodes();

    /**
     * 查询个节点的标签
     * @param name
     * @return
     */
    String getLabel(String name);

    /**
     * 查询单个节点的属性
     * @param name
     * @return
     */
    Object getNode(String name);
}
