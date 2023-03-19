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
@NodeEntity(label = "水产品幼体")
public class AquaticProductLarvae extends CommonNode {

    /**
     * 特征
     */
    @Property(name = "特征")
    private String characteristic;

    /**
     * 育苗场地
     */
    @Property(name = "成长")
    private String glowInto;

    /**
     * 饲养饵料
     */
    @Property(name = "饲养饵料")
    private String feeding;
}
