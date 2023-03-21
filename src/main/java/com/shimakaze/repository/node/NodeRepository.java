package com.shimakaze.repository.node;


import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/19 20:32:21
 */

@Repository
public interface NodeRepository  extends Neo4jRepository<String, Long> {
    //查询节点的标签
    @Query("MATCH (n{name:{0}}) RETURN labels(n)")
    String getLabel(String name);
}
