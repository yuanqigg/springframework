package com.learm.myself.springjpa.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServicesImplTest {

    @Autowired
    private UserServices userServices;

    @Test
    public void test() throws Exception {
        userServices.findUserById(3);
        userServices.findUserById(3);
        userServices.findUserById(3);
        userServices.findUserById(3);
    }


}
