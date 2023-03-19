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
@NodeEntity(label = "育苗场地")
public class SeedingPlace extends CommonNode {
    /**
     * 池塘设备
     */
    @Property(name = "池塘设备")
    private String equipment;
}
