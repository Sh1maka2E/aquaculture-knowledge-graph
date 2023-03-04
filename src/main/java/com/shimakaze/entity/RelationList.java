package com.shimakaze.entity;

/**
 * 用于前端画知识图谱的Relation集合实体类
 */
public class RelationList {
    private String startNode;
    private String relation;
    private String endNode;


    public RelationList(){

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
