package com.shimakaze.repository.node;

import com.shimakaze.entity.node.Disease;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiseaseRepository extends GraphRepository<Disease>{


	@Query(value = "MATCH (n:`疾病`) RETURN n")
	List<Disease> getDiseaseList();

}
