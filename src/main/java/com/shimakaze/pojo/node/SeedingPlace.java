package com.shimakaze.pojo.node;


import com.shimakaze.common.CommonNode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:07:24
 */

@NodeEntity(label = "育苗场地")
public class SeedingPlace extends CommonNode {
    /**
     * 池塘设备
     */
    @Property(name = "池塘设备")
    private String equipment;

    @Override
    public String toString() {
        return "SeedingPlace{" +
                "name='" + name + '\'' +
                ", equipment='" + equipment + '\'' +
                '}';
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
}
