package com.shimakaze.repository.relation;

import com.shimakaze.entity.relation.ShrimpDisease;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface ShrimpDiseaseRepository extends GraphRepository<ShrimpDisease>{

	/**
	 * 查询关系
	 */
	@Query(value = "MATCH p=()-[r:`南美白对虾可能患有的疾病`]->() RETURN p")
	List<ShrimpDisease> getShrimpDiseaseList();

}
