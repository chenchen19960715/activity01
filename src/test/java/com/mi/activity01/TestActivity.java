package com.mi.activity01;

import com.mi.activity01.pojo.Activity;
import com.mi.activity01.service.ActivityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestActivity {
    @Autowired
    private ActivityService as;
    @Test
    public void selectAll(){
        List<Activity> acList = as.selectAll();
        for (Activity ac:
             acList) {
            System.out.println(ac.toString());
        }

    }
}
