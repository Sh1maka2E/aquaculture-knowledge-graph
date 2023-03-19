package com.shimakaze.pojo.relation;

import com.shimakaze.common.CommonNode;
import com.shimakaze.common.CommonRelation;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:32:28
 */
@Data
@RelationshipEntity(type = "可能患有疾病")
public class MaySuffer extends CommonRelation {
}
