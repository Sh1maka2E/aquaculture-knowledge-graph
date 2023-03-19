package com.shimakaze.repository.relation;


import com.shimakaze.pojo.relation.Feeding;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:35:08
 */
@Repository
public interface FeedingRepository extends Neo4jRepository<Feeding, Long> {
    @Query("MATCH p=()-[r:`投喂`]->() RETURN p")
    List<Feeding> getRelations();

    @Query("MATCH p=(n{name:{0}})-[r:`投喂`]->() RETURN p")
    List<Feeding> getRelations(String head);
}
