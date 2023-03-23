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
@NodeEntity(label = "育苗场地")
public class SeedingPlace extends CommonNode {
    /**
     * 面积
     */
    @Property(name = "面积")
    @JsonProperty(value = "面积")
    private String area;

    /**
     * 池深
     */
    @Property(name = "池深")
    @JsonProperty(value = "池深")
    private String depth;

    /**
     * 池塘设备
     */
    @Property(name = "池塘设备")
    @JsonProperty(value = "池塘设备")
    private String equipment;

    /**
     * 所属标签
     */
    @Property(name = "所属标签")
    @JsonProperty(value = "所属标签")
    private String label;
}
