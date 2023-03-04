package com.shimakaze.repository.relation;

import com.shimakaze.entity.relation.Grow;
import com.shimakaze.entity.relation.GrowField;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface GrowFieldRepository extends GraphRepository<GrowField>{

	/**
	 * 查询关系
	 */
	@Query("MATCH p=()-[r:`育苗场地`]->() RETURN p")
	List<GrowField> getGrowFieldList();

}
