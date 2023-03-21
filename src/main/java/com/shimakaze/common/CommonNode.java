package com.shimakaze.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.neo4j.ogm.annotation.GraphId;


/**
 * 公共节点类
 */
@Data
public class CommonNode {
    @GraphId
    @JsonIgnore //id不需要返回给前端
    protected Long id;
    @JsonProperty(value = "名称") //返回给前端的属性名称
    protected String name;
}
