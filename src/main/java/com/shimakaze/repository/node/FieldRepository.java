package com.shimakaze.repository.node;

import com.shimakaze.entity.node.Field;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FieldRepository extends GraphRepository<Field>{


	@Query(value = "MATCH (n:`场地`) RETURN n")
	List<Field> getFieldList();

}
