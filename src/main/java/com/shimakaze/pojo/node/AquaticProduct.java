package com.shimakaze.pojo.node;


import com.shimakaze.common.CommonNode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:07:24
 */

@NodeEntity(label = "水产品")
public class AquaticProduct extends CommonNode {
    /**
     * 别名
     */
    @Property(name = "俗称")
    private String alias;

    /**
     * 可能患有疾病
     */
    @Property(name = "可能患有疾病")
    private String maySuffer;

    /**
     * 栖息地
     */
    @Property(name = "栖息地")
    private String habitat;

    /**
     * 特征
     */
    @Property(name = "特征")
    private String characteristic;

    /**
     * 育苗场地
     */
    @Property(name = "育苗场地")
    private String seedingPlace;

    /**
     * 饲养饵料
     */
    @Property(name = "饲养饵料")
    private String feeding;

    @Override
    public String toString() {
        return "AquaticProduct{" +
                "name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", maySuffer='" + maySuffer + '\'' +
                ", habitat='" + habitat + '\'' +
                ", characteristic='" + characteristic + '\'' +
                ", seedingPlace='" + seedingPlace + '\'' +
                ", feeding='" + feeding + '\'' +
                '}';
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getMaySuffer() {
        return maySuffer;
    }

    public void setMaySuffer(String maySuffer) {
        this.maySuffer = maySuffer;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getSeedingPlace() {
        return seedingPlace;
    }

    public void setSeedingPlace(String seedingPlace) {
        this.seedingPlace = seedingPlace;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }
}
