package com.hawcore.framework.multiplyds.controller;

import com.hawcore.framework.multiplyds.entity.db.User;
import com.hawcore.framework.multiplyds.service.TestService;
import com.hawcore.framework.multiplyds.service.db.IUserService;
import com.hawcore.framework.multiplyds.service.db1.IUserService1;
import com.hawcore.framework.multiplyds.service.db2.IUserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    IUserService iUserService;

    @Autowired
    IUserService1 userService1;

    @Autowired
    IUserService2 userService2;

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser(Integer id) {
//        System.out.println(testService.test());
//        System.out.println(iUserService.test());
        User user = iUserService.selectById(id);
        System.out.println(user);
        System.out.println(userService1.selectById(id));
        System.out.println(userService2.selectById(id));
        return user;
    }

}
