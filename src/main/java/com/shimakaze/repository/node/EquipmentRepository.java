package com.shimakaze.repository.node;

import com.shimakaze.entity.node.Disease;
import com.shimakaze.entity.node.Equipment;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends GraphRepository<Equipment>{


	@Query(value = "MATCH (n:`设备`) RETURN n")
	List<Equipment> getEquipmentList();

}
