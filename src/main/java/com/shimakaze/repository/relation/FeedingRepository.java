package com.shimakaze.repository.relation;

import com.shimakaze.entity.relation.Feeding;
import com.shimakaze.entity.relation.Grow;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface FeedingRepository extends GraphRepository<Feeding>{

	/**
	 * 查询关系
	 */
	@Query("MATCH p=()-[r:`饲养饵料`]->() RETURN p")
	List<Feeding> getFeedingList();

}
