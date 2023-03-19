package com.shimakaze.service.node;

import com.shimakaze.pojo.node.Feed;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:19:50
 */
public interface FeedService {
    // 查询所有节点
    List<Feed> getNodes();

    // 查询单个节点的属性
    Feed getNode(String name);
}
