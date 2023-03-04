package com.shimakaze.repository.node;

import com.shimakaze.entity.node.AquaticProductLarva;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AquaticProductLarvaRepository extends GraphRepository<AquaticProductLarva>{

	@Query(value = "MATCH (n:`水产品幼体`) RETURN n")
	List<AquaticProductLarva> getAquaticProductLarvaList();

}
