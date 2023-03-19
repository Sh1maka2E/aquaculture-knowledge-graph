package com.shimakaze;

import com.shimakaze.common.RelationDto;
import com.shimakaze.repository.node.*;
import com.shimakaze.repository.relation.*;
import com.shimakaze.service.node.*;
import com.shimakaze.service.relation.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RepositoryTests {
    @Autowired
    private EquipWithRepository equipWithRepository;

    @Autowired
    private FeedingRepository feedingRepository;

    @Autowired
    private GlowIntoRepository glowIntoRepository;

    @Autowired
    private LiveInRepository liveInRepository;

    @Autowired
    private MaySufferRepository maySufferRepository;

    @Autowired
    private RaisedInRepository raisedInRepository;

    @Autowired
    private RelationService relationService;

    @Autowired
    private NodeRepository nodeRepository;

    @Autowired
    private AquaticProductLarvaeRepository aquaticProductLarvaeRepository;

    @Autowired
    private AquaticProductRepository aquaticProductRepository;

    @Autowired
    private DiseaseRepository diseaseRepository;

    @Autowired
    private EquipmentRepository equipmentRepository;

    @Autowired
    private FeedRepository feedRepository;

    @Autowired
    private HabitatRepository habitatRepository;

    @Autowired
    private SeedingPlaceRepository seedingPlaceRepository;


    @Test
    public void testQueryRelationString(){
        System.out.println(equipWithRepository.getRelations());
        System.out.println(feedingRepository.getRelations());
        System.out.println(glowIntoRepository.getRelations());
        System.out.println(liveInRepository.getRelations());
        System.out.println(maySufferRepository.getRelations());
        System.out.println(raisedInRepository.getRelations());
    }

    @Test
    public void testQueryRelationWithoutRepetition(){
        RelationDto relationDto1 = new RelationDto();
        relationDto1.setStartNode("南美白对虾");
        relationDto1.setRelation("投喂");
        relationDto1.setEndNode("沙蚕");

        RelationDto relationDto2 = new RelationDto();
        relationDto2.setStartNode("南美白对虾");
        relationDto2.setRelation("投喂");
        relationDto2.setEndNode("牡蛎");

        RelationDto relationDto3 = new RelationDto();
        relationDto3.setStartNode("南美白对虾");
        relationDto3.setRelation("栖息于");
        relationDto3.setEndNode("栖息于");

        List<RelationDto> list = new ArrayList<>();
        list.add(relationDto1);
        list.add(relationDto2);
        list.add(relationDto3);
        List<String> collect = list.stream()
                .map(RelationDto::getRelation)
                .distinct()
                .collect(Collectors.toList());


        System.out.println(collect);

    }

    @Test
    public void testQueryNode(){
//        System.out.println(nodeRepository.getLabel("草鱼"));
//        System.out.println(nodeRepository.getLabel("鳖塘"));
//        System.out.println(nodeRepository.getLabel("蚯蚓"));

//        aquaticProductRepository.getNodes().forEach(s -> {
//            System.out.println(s.toString());
//        });

        System.out.println(aquaticProductLarvaeRepository.getNode("蚤状幼体").toString());
        System.out.println(aquaticProductRepository.getNode("南美白对虾").toString());
        System.out.println(diseaseRepository.getNode("烂鳃病").toString());
        System.out.println(equipmentRepository.getNode("喷水式增氧机").toString());
        System.out.println(feedRepository.getNode("蚯蚓").toString());
        System.out.println(habitatRepository.getNode("湖泊").toString());
        System.out.println(seedingPlaceRepository.getNode("草鱼塘").toString());

    }


}
