package com.shimakaze.repository.relation;

import com.shimakaze.entity.relation.GrowField;
import com.shimakaze.entity.relation.GrowTool;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface GrowToolRepository extends GraphRepository<GrowTool>{

	/**
	 * 查询关系
	 */
	@Query("MATCH p=()-[r:`育苗工具`]->() RETURN p")
	List<GrowTool> getGrowToolList();

}
