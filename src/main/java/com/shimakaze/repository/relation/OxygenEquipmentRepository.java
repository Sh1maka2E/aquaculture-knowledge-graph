package com.shimakaze.repository.relation;

import com.shimakaze.entity.relation.OxygenEquipment;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface OxygenEquipmentRepository extends GraphRepository<OxygenEquipment>{

	/**
	 * 查询关系
	 */
	@Query("MATCH p=()-[r:`增氧设备`]->() RETURN p")
	List<OxygenEquipment> getOxygenEquipmentList();

}
