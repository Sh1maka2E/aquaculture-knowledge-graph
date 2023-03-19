package com.shimakaze.common;


/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:56:17
 */

import lombok.Data;

/**
 * 传递给前端的关系封装类
 */
@Data
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
}
