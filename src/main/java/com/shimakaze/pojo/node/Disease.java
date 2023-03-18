package com.shimakaze.pojo.node;


import com.shimakaze.common.CommonNode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:07:24
 */

@NodeEntity(label = "疾病")
public class Disease extends CommonNode {

    /**
     * 症状
     */
    @Property(name = "症状")
    private String symptom;

    @Override
    public String toString() {
        return "Disease{" +
                "name='" + name + '\'' +
                ", symptom='" + symptom + '\'' +
                '}';
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
}
