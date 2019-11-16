package com.city.oa;

import com.city.oa.bean.User;
import com.city.oa.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootSsmApplicationTests {

    @Autowired
    private UserServiceImpl service;

    @Test
    public void contextLoads() {
       /* User user = service.getById(1);
        System.out.println(user);*/

        List<User> all = service.getAll();
        all.forEach(e-> System.out.println(e));
        new Thread(()->{
            System.out.println("hello");
        });
    }

}
