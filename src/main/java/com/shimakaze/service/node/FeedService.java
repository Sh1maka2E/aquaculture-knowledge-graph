package com.shimakaze.service.node;

import com.shimakaze.pojo.node.Disease;
import com.shimakaze.pojo.node.Feed;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:19:50
 */
public interface FeedService {
    List<Feed> getNodes();
}
