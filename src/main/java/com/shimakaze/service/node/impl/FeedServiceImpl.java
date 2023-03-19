package com.shimakaze.service.node.impl;

import com.shimakaze.pojo.node.Feed;
import com.shimakaze.repository.node.FeedRepository;
import com.shimakaze.service.node.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:20:19
 */
@Service
public class FeedServiceImpl implements FeedService {

    @Autowired
    private FeedRepository feedRepository;

    /**
     * 查询所有节点
     * @return
     */
    @Override
    public List<Feed> getNodes() {
        return feedRepository.getNodes();
    }


    /**
     * 查询单个节点的属性
     * @param name
     * @return
     */
    @Override
    public Feed getNode(String name) {
        return feedRepository.getNode(name);
    }
}
