package com.shimakaze;

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
import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceTests {

    @Autowired
    private AquaticProductService aquaticProductService;

    @Autowired
    private AquaticProductLarvaeService aquaticProductLarvaeService;

    @Autowired
    private DiseaseService diseaseService;

    @Autowired
    private EquipmentService equipmentService;

    @Autowired
    private FeedService feedService;

    @Autowired
    private HabitatService habitatService;

    @Autowired
    private SeedingPlaceService seedingPlaceService;

    @Autowired
    private EquipWithService equipWithService;

    @Autowired
    private FeedingService feedingService;

    @Autowired
    private GlowIntoService glowIntoService;

    @Autowired
    private LiveInService liveInService;

    @Autowired
    private MaySufferService maySufferService;

    @Autowired
    private RaisedInService raisedInService;

    @Test
    public void testQueryNode() {
//        System.out.println(GetAnnotationNameUtil.getNodeName(AquaticProduct.class));
        aquaticProductService.getNodes().forEach(System.out::println);
        aquaticProductLarvaeService.getNodes().forEach(System.out::println);
        diseaseService.getNodes().forEach(System.out::println);
        equipmentService.getNodes().forEach(System.out::println);
        feedService.getNodes().forEach(System.out::println);
        habitatService.getNodes().forEach(System.out::println);
        seedingPlaceService.getNodes().forEach(System.out::println);
    }

    @Test
    public void testQueryRelationString(){
        equipWithService.getRelations().forEach(System.out::println);
//        feedingService.getRelations().forEach(System.out::println);
//        liveInService.getRelations().forEach(System.out::println);
//        raisedInService.getRelations().forEach(System.out::println);
    }

    @Test
    public void testQueryRelationWithName(){
        System.out.println(equipWithService.getRelations("鳖塘").isEmpty());
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        List<String> q = list.stream().filter(value -> value.equals("a")).collect(Collectors.toList());
        System.out.println(q);
    }

}
