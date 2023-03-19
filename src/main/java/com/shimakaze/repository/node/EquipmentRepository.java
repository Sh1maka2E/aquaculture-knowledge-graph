package com.shimakaze.repository.node;



import com.shimakaze.pojo.node.Equipment;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:17:01
 */
@Repository
public interface EquipmentRepository extends Neo4jRepository<Equipment, Long> {
    @Query("MATCH (n:`池塘设备`) RETURN n")
    List<Equipment> queryAll();
}