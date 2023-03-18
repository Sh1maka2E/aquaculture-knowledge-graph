package com.shimakaze.common;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.StartNode;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:56:17
 */
public class CommonRelation {
    @GraphId
    protected Long id;

    @StartNode
    protected CommonNode startNode;

    @EndNode
    protected CommonNode endNode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CommonNode getStartNode() {
        return startNode;
    }

    public void setStartNode(CommonNode startNode) {
        this.startNode = startNode;
    }

    public CommonNode getEndNode() {
        return endNode;
    }

    public void setEndNode(CommonNode endNode) {
        this.endNode = endNode;
    }
}
