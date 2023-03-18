package com.shimakaze.pojo.relation;

import com.shimakaze.common.CommonRelation;
import org.neo4j.ogm.annotation.RelationshipEntity;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:32:28
 */
@RelationshipEntity(type = "投喂")
public class Feeding extends CommonRelation {
    @Override
    public String toString() {
        return "Feeding{" +
                "id=" + id +
                ", startNode=" + startNode +
                ", endNode=" + endNode +
                '}';
    }
}
