package com.shimakaze.repository.node;

import com.shimakaze.entity.node.Preparation;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreparationRepository extends GraphRepository<Preparation>{


	@Query(value = "MATCH (n:`准备`) RETURN n")
	List<Preparation> getPreparationList();

}
