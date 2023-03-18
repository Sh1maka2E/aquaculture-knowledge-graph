package com.shimakaze.repository.node;



import com.shimakaze.pojo.node.AquaticProduct;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:17:01
 */
@Repository
public interface AquaticProductRepository extends Neo4jRepository<AquaticProduct, Long> {
//    @Query("MATCH (n:`水产品` {name:{0}}) RETURN n")
    @Query("MATCH (n:`水产品`) RETURN n")
    List<AquaticProduct> queryAll();
}