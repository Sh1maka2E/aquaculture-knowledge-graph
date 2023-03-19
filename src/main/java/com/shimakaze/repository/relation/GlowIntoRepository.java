package com.shimakaze.repository.relation;


import com.shimakaze.pojo.relation.GlowInto;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:35:08
 */
@Repository
public interface GlowIntoRepository extends Neo4jRepository<GlowInto, Long> {
    @Query("MATCH p=()-[r:`成长`]->() RETURN p")
    List<GlowInto> getRelations();

    @Query("MATCH p=(n{name:{0}})-[r:`成长`]->() RETURN p")
    List<GlowInto> getRelations(String head);
}
