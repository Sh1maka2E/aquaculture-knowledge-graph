package com.shimakaze.repository.relation;


import com.shimakaze.pojo.relation.EquipWith;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:35:08
 */
@Repository
public interface EquipWithRepository extends Neo4jRepository<EquipWith, Long> {
    // 根据关系查询
    @Query("MATCH p=()-[r:`需要配备`]->() RETURN p")
    List<EquipWith> getRelations();

    // 根据头节点和关系查询
    @Query("MATCH p=(n{name:{0}})-[r:`需要配备`]->() RETURN p")
    List<EquipWith> getRelations(String name);
}
