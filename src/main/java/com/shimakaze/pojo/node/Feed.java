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
@NodeEntity(label = "饲养饵料")
public class Feed extends CommonNode {

    /**
     * 特征
     */
    @Property(name = "特征")
    private String characteristic;

}
