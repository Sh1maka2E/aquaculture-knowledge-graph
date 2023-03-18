package com.shimakaze;

import com.shimakaze.repository.relation.*;
import com.shimakaze.service.node.*;
import com.shimakaze.service.relation.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
    public void testQueryRelationWithName(){
        System.out.println(maySufferRepository.getRelations("南美白对虾"));
    }


}
