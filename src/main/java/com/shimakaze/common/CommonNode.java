package com.shimakaze.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;


/**
 * 公共节点类
 */
@Data
public class CommonNode {
    @Id
    @JsonIgnore //id不需要返回给前端
    protected Long id;
//    @JsonProperty(value = "名称") //返回给前端的属性名称
    protected String name;

    /**
     * 所属标签
     */
    @Property(name = "所属标签")
//    @JsonProperty(value = "所属标签")
    private String label;
}
