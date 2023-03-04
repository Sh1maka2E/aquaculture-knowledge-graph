package com.shimakaze.repository.relation;

import com.shimakaze.entity.relation.FishDisease;
import com.shimakaze.entity.relation.ShrimpDisease;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface FishDiseaseRepository extends GraphRepository<FishDisease>{

	/**
	 * 查询关系
	 */
	@Query(value = "MATCH p=()-[r:`草鱼可能患有的疾病`]->() RETURN p")
	List<FishDisease> getFishDiseaseList();

}
