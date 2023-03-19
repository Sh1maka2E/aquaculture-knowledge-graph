package com.shimakaze.repository.node;



import com.shimakaze.pojo.node.SeedingPlace;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:17:01
 */
@Repository
public interface SeedingPlaceRepository extends Neo4jRepository<SeedingPlace, Long> {
    @Query("MATCH (n:`育苗场地`) RETURN n")
    List<SeedingPlace> queryAll();
}