package com.shimakaze.utils;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.RelationshipEntity;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:25:50
 */
public class GetAnnotationNameUtil {

    public static String getNodeName(Class clazz){
        // 反射获取Node注解的type值，即节点标签名称
        String label = ((NodeEntity) clazz.getAnnotation(NodeEntity.class)).label();
        return label;
    }

    public static String getRelationName(Class clazz){
        // 反射获取Node注解的type值，即节点标签名称
        String relation = ((RelationshipEntity) clazz.getAnnotation(RelationshipEntity.class)).type();
        return relation;
    }
}
