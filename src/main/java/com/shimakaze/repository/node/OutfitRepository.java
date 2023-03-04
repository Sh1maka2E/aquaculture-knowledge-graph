package com.shimakaze.repository.node;

import com.shimakaze.entity.node.Disease;
import com.shimakaze.entity.node.Outfit;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OutfitRepository extends GraphRepository<Outfit>{


	@Query(value = "MATCH (n:`配备`) RETURN n")
	List<Outfit> getOutfitList();

}
