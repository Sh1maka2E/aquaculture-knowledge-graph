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
@NodeEntity(label = "池塘设备")
public class Equipment extends CommonNode {

    /**o
     * 作用
     */
    @Property(name = "作用")
    @JsonProperty(value = "作用")
    private String function;

}
