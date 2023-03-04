package com.shimakaze.repository.relation;

import com.shimakaze.entity.relation.PreparationBeforeStocking;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface PreparationBeforeStockingRepository extends GraphRepository<PreparationBeforeStocking>{

	/**
	 * 查询关系
	 */
	@Query("MATCH p=()-[r:`放养前准备`]->() RETURN p")
	List<PreparationBeforeStocking> getPreparationBeforeStockingList();

}
