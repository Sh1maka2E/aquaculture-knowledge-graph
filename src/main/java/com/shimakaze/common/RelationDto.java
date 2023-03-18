package com.shimakaze.common;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.StartNode;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:56:17
 */
public class RelationDto {
    private String startNode;
    private String relation;
    private String endNode;

    @Override
    public String toString() {
        return "RelationDto{" +
                "startNode='" + startNode + '\'' +
                ", relation='" + relation + '\'' +
                ", endNode='" + endNode + '\'' +
                '}';
    }

    public String getStartNode() {
        return startNode;
    }

    public void setStartNode(String startNode) {
        this.startNode = startNode;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getEndNode() {
        return endNode;
    }

    public void setEndNode(String endNode) {
        this.endNode = endNode;
    }
}
