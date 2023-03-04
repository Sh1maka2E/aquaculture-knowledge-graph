package com.shimakaze.repository.node;

import com.shimakaze.entity.node.Disease;
import com.shimakaze.entity.node.Feed;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedRepository extends GraphRepository<Feed>{

	@Query(value = "MATCH (n:`饵料`) RETURN n")
	List<Feed> getFeedList();

}
