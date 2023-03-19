package com.shimakaze.pojo.node;


import com.shimakaze.common.CommonNode;
import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:07:24
 */
@Data
@NodeEntity(label = "池塘设备")
public class Equipment extends CommonNode {

    /**o
     * 池塘设备属性
     */
    @Property(name = "池塘设备属性")
    private String equipmentProperty;
}
