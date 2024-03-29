package com.shimakaze.controller;

import com.shimakaze.common.RelationDto;
import com.shimakaze.service.node.*;
import com.shimakaze.service.relation.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/18 19:22:12
 */
@Slf4j
@RestController
@RequestMapping("/neo4j")
public class Neo4jController {

    @Autowired
    private NodeService nodeService;

    @Autowired
    private RelationService relationService;

    /**
     * 返回所有节点
     * @return
     */
    @GetMapping("/getHeads")
    public List<Object> getHeads(){
        return nodeService.getNodes();
    }

    /**
     * 返回单个节点的属性
     * @param head
     * @return
     */
    @GetMapping("/getHead/{head}")
    public Object getHead(@PathVariable(value = "head") String head) {
        return nodeService.getNode(head);
    }

    /**
     * 返回所有关系，head和relation为可选项
     * @param head
     * @return
     */
    @GetMapping(value = {"/getRelations", "/getRelations/{head}","/getRelations/{head}/{relation}"})
    public List<RelationDto> getRelations(@PathVariable(required = false, value = "head") String head,
                                          @PathVariable(required = false, value = "relation") String relation){
        return relationService.getRelations(head,relation);
    }

    /**
     * 返回指定head的所有关系（仅返回关系名称，关系不重复）
     * @param head
     * @return
     */
    @GetMapping("/getRelationsWithoutRepetition/{head}")
    public List<String> getRelationsByHead(@PathVariable(value = "head") String head){
        return relationService.getRelationsWithoutRepetition(head);
    }

}
