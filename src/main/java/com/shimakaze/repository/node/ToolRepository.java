package com.shimakaze.repository.node;

import com.shimakaze.entity.node.Tool;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToolRepository extends GraphRepository<Tool>{


	@Query(value = "MATCH (n:`工具`) RETURN n")
	List<Tool> getToolList();

}
