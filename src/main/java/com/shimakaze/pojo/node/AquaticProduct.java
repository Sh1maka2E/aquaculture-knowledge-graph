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
@NodeEntity(label = "水产品")
public class AquaticProduct extends CommonNode {
    /**
     * 别名
     */
    @Property(name = "别名")
    @JsonProperty(value = "别名")
    private String alias;

    /**
     * 特征
     */
    @Property(name = "特征")
    @JsonProperty(value = "特征")
    private String characteristic;

    /**
     * 栖息地
     */
    @Property(name = "栖息地")
    @JsonProperty(value = "栖息地")
    private String habitat;

    /**
     * 繁殖季节
     */
    @Property(name = "繁殖季节")
    @JsonProperty(value = "繁殖季节")
    private String breedingSeason;

    /**
     * 育苗场地
     */
    @Property(name = "育苗场地")
    @JsonProperty(value = "育苗场地")
    private String seedingPlace;

    /**
     * 饲养饵料
     */
    @Property(name = "饲养饵料")
    @JsonProperty(value = "饲养饵料")
    private String feeding;

    /**
     * 可能患有疾病
     */
    @Property(name = "可能患有疾病")
    @JsonProperty(value = "可能患有疾病")
    private String maySuffer;

    /**
     * 图片url
     */
    @Property(name = "图片")
    @JsonProperty(value = "图片")
    private String imgUrl;

    /**
     * 所属标签
     */
    @Property(name = "所属标签")
    @JsonProperty(value = "所属标签")
    private String label;

}
