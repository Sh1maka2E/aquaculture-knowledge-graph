package com.shimakaze.repository.relation;

import com.shimakaze.entity.relation.GrowEquipment;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface GrowEquipmentRepository extends GraphRepository<GrowEquipment>{

	/**
	 * 查询关系
	 */
	@Query("MATCH p=()-[r:`育苗设备`]->() RETURN p")
	List<GrowEquipment> getGrowEquipmentList();

}
