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
@NodeEntity(label = "疾病")
public class Disease extends CommonNode {
    /**
     * 症状
     */
    @Property(name = "症状")
    @JsonProperty(value = "症状")
    private String symptom;

    /**
     * 病因
     */
    @Property(name = "病因")
    @JsonProperty(value = "病因")
    private String etiology;

    /**
     * 防治方法
     */
    @Property(name = "防治方法")
    @JsonProperty(value = "防治方法")
    private String controlMethod;
}
