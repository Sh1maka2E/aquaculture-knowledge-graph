package com.shimakaze.repository.relation;

import com.shimakaze.entity.relation.Grow;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface GrowRepository extends GraphRepository<Grow>{

	/**
	 * 查询关系
	 */
	@Query("MATCH p=(m:`水产品幼体`)-[r:`成长`]->(n:`水产品幼体`) RETURN p")
	List<Grow> getGrowLarvaToLarvaList();


	@Query("MATCH p=(m:`水产品幼体`)-[r:`成长`]->(n:`水产品`) RETURN p")
	List<Grow> getGrowLarvaToAdultList();
}
