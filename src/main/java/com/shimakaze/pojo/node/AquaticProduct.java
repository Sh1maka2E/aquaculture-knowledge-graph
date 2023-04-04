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
     * 拉丁学名
     */
    @Property(name = "拉丁学名")
    @JsonProperty(value = "拉丁学名")
    private String latinName;

    /**
     * 界
     */
    @Property(name = "界")
    @JsonProperty(value = "界")
    private String taxonomyKingdom;

    /**
     * 门
     */
    @Property(name = "门")
    @JsonProperty(value = "门")
    private String taxonomyPhylum;

    /**
     * 亚门
     */
    @Property(name = "亚门")
    @JsonProperty(value = "亚门")
    private String taxonomySubPhylum;

    /**
     * 纲
     */
    @Property(name = "纲")
    @JsonProperty(value = "纲")
    private String taxonomyClass;

    /**
     * 亚纲
     */
    @Property(name = "亚纲")
    @JsonProperty(value = "亚纲")
    private String taxonomySubClass;

    /**
     * 目
     */
    @Property(name = "目")
    @JsonProperty(value = "目")
    private String taxonomyOrder;

    /**
     * 亚目
     */
    @Property(name = "亚目")
    @JsonProperty(value = "亚目")
    private String taxonomySubOrder;

    /**
     * 科
     */
    @Property(name = "科")
    @JsonProperty(value = "科")
    private String taxonomyFamily;

    /**
     * 亚科
     */
    @Property(name = "亚科")
    @JsonProperty(value = "亚科")
    private String taxonomySubFamily;

    /**
     * 属
     */
    @Property(name = "属")
    @JsonProperty(value = "属")
    private String taxonomyGenus;

    /**
     * 种
     */
    @Property(name = "种")
    @JsonProperty(value = "种")
    private String taxonomySpecies;

    /**
     * 亚种
     */
    @Property(name = "亚种")
    @JsonProperty(value = "亚种")
    private String taxonomySubSpecies;

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
//    @JsonProperty(value = "图片")
    private String image;
}
