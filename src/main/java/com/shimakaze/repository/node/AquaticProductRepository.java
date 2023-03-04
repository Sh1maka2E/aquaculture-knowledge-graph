package com.shimakaze.repository.node;

import com.shimakaze.entity.node.AquaticProduct;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AquaticProductRepository extends GraphRepository<AquaticProduct>{

	@Query(value = "MATCH (n:`水产品`) RETURN n")
	List<AquaticProduct> getAquaticProductList();

}
