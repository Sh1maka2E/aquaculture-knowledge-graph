package com.shimakaze.repository.relation;


import com.shimakaze.pojo.relation.LiveIn;
import com.shimakaze.pojo.relation.RaisedIn;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:35:08
 */
@Repository
public interface RaisedInRepository extends Neo4jRepository<RaisedIn, Long> {
    @Query("MATCH p=()-[r:`养殖于`]->() RETURN p")
    List<RaisedIn> getRelations();

    @Query("MATCH p=(n{name:{0}})-[r:`养殖于`]->() RETURN p")
    List<RaisedIn> getRelations(String head);
}
