package com.shimakaze.controller;

import com.shimakaze.entity.Head;
import com.shimakaze.entity.node.*;
import com.shimakaze.repository.node.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/head")
public class HeadController {
    @Autowired
    private AquaticProductRepository aquaticProductRepository;
    @Autowired
    private DiseaseRepository diseaseRepository;
    @Autowired
    private EquipmentRepository equipmentRepository;
    @Autowired
    private FeedRepository feedRepository;
    @Autowired
    private FieldRepository fieldRepository;
    @Autowired
    private OutfitRepository outfitRepository;
    @Autowired
    private PreparationRepository preparationRepository;
    @Autowired
    private ToolRepository toolRepository;



    /**
     * 查询所有标签
     * @return
     */
    @GetMapping("/getHeads")
    public List<Head> getHeads() {
        //将所有标签下的节点放到list中
        List<String> list = new ArrayList<>();
        List<AquaticProduct> aquaticProductList = aquaticProductRepository.getAquaticProductList();
        for(AquaticProduct aquaticProduct : aquaticProductList){
            list.add(aquaticProduct.getName());
        }
        List<Disease> diseaseList = diseaseRepository.getDiseaseList();
        for(Disease disease : diseaseList){
            list.add(disease.getName());
        }
        List<Equipment> equipmentList = equipmentRepository.getEquipmentList();
        for(Equipment equipment : equipmentList){
            list.add(equipment.getName());
        }
        List<Feed> feedList = feedRepository.getFeedList();
        for(Feed feed : feedList){
            list.add(feed.getName());
        }
        List<Field> fieldList = fieldRepository.getFieldList();
        for(Field field : fieldList){
            list.add(field.getName());
        }
        List<Outfit> outfitList = outfitRepository.getOutfitList();
        for(Outfit outfit : outfitList){
            list.add(outfit.getName());
        }
        List<Preparation> preparationList = preparationRepository.getPreparationList();
        for(Preparation preparation : preparationList){
            list.add(preparation.getName());
        }
        List<Tool> toolList = toolRepository.getToolList();
        for(Tool tool : toolList){
            list.add(tool.getName());
        }
        //依次取出list中所有节点的name值（即为前端需要的head）赋给headList，返回给前端
        List<Head> headList = new ArrayList<>();
        for(String name : list){
            Head head = new Head();
            head.setName(name);
            headList.add(head);
        }
        return headList;
    }
}
