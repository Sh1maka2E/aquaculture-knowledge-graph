package com.shimakaze.repository.relation;

import com.shimakaze.entity.relation.PoolOutfit;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface PoolOutfitRepository extends GraphRepository<PoolOutfit>{

	/**
	 * 查询关系
	 */
	@Query("MATCH p=()-[r:`池塘配备`]->() RETURN p")
	List<PoolOutfit> getPoolEquipmentList();

}
