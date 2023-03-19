package com.shimakaze.pojo.node;


import com.shimakaze.common.CommonNode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:07:24
 */

@NodeEntity(label = "池塘设备")
public class Equipment extends CommonNode {

    /**
     * 池塘设备属性
     */
    @Property(name = "池塘设备属性")
    private String equipmentProperty;

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", equipmentProperty='" + equipmentProperty + '\'' +
                '}';
    }

    public String getEquipmentProperty() {
        return equipmentProperty;
    }

    public void setEquipmentProperty(String equipmentProperty) {
        this.equipmentProperty = equipmentProperty;
    }
}