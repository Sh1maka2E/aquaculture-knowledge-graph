package com.shimakaze.utils;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.RelationshipEntity;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:25:50
 */

/**
 * 工具类，获取node类和relation类的注解（即在数据库中的名称）
 */
public class GetAnnotationNameUtil {

    public static String getNodeName(Class clazz){
        // 反射获取NodeEntity注解的label值，即节点标签名称
        String label = ((NodeEntity) clazz.getAnnotation(NodeEntity.class)).label();
        return label;
    }

    public static String getRelationName(Class clazz){
        // 反射获取RelationshipEntity注解的type值，即关系名称
        String relation = ((RelationshipEntity) clazz.getAnnotation(RelationshipEntity.class)).type();
        return relation;
    }
}
