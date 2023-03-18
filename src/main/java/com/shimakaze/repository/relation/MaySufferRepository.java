package com.shimakaze.repository.relation;


import com.shimakaze.pojo.relation.MaySuffer;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:35:08
 */
@Repository
public interface MaySufferRepository extends Neo4jRepository<MaySuffer, Long> {
    @Query("MATCH p=()-[r:`可能患有疾病`]->() RETURN p")
    List<MaySuffer> getRelations();

    @Query("MATCH p=(n{name:{0}})-[r:`可能患有疾病`]->() RETURN p")
    List<MaySuffer> getRelations(String head);
}
