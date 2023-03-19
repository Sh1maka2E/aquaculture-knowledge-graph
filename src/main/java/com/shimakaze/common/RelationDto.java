package com.shimakaze.common;


/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:56:17
 */

/**
 * 传递给前端的关系封装类
 */
public class RelationDto {
    /**
     * 开始节点
     */
    private String startNode;
    /**
     * 关系名称
     */
    private String relation;
    /**
     * 尾节点
     */
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
