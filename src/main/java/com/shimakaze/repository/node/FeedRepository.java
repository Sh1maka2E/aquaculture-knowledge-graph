package com.shimakaze.repository.node;



import com.shimakaze.pojo.node.Feed;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:17:01
 */
@Repository
public interface FeedRepository extends Neo4jRepository<Feed, Long> {
    @Query("MATCH (n:`饲养饵料`) RETURN n")
    List<Feed> queryAll();
}