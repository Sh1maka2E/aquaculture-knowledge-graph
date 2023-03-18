package com.shimakaze.service.node;

import com.shimakaze.pojo.node.AquaticProduct;
import org.springframework.data.neo4j.annotation.Query;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 11:19:50
 */
public interface AquaticProductService {
    List<AquaticProduct> getNodes();
}
