package com.shimakaze.repository.node;

import com.shimakaze.pojo.node.Feed;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:17:01
 */
@Repository
public interface FeedRepository extends Neo4jRepository<Feed, Long> {
    // 查询所有节点
    @Query("MATCH (n:`饲养饵料`) RETURN n")
    List<Feed> getNodes();

    // 查询单个节点
    @Query("MATCH (n:`饲养饵料`) WHERE n.name = {name} RETURN n")
    Feed getNode(@Param(value = "name") String name);
}