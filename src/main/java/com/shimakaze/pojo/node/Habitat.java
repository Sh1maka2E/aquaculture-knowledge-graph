package com.shimakaze.pojo.node;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.shimakaze.common.CommonNode;
import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:07:24
 */
@Data
@NodeEntity(label = "栖息地")
public class Habitat extends CommonNode {

    /**
     * 特征
     */
    @Property(name = "特征")
    @JsonProperty(value = "特征")
    private String characteristic;
}
