package com.hawcore.framework.multiplyds.controller;

import com.hawcore.framework.multiplyds.entity.db.User;
import com.hawcore.framework.multiplyds.service.TestService;
import com.hawcore.framework.multiplyds.service.db.IUserService;
import com.hawcore.framework.multiplyds.service.db1.IUserService1;
import com.hawcore.framework.multiplyds.service.db2.IUserService2;
import com.hawcore.framework.multiplyds.service.product.IProductService;
import com.hawcore.framework.multiplyds.util.PageResponseDTO;
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

    @Autowired
    private IProductService productService;

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

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public PageResponseDTO<com.hawcore.framework.multiplyds.entity.db1.User> select(int page, int pagesize) {

        return userService1.select(page, pagesize);
    }

    @RequestMapping(value = "/testProduct", method = RequestMethod.GET)
    public String testProduct() {
        System.out.println(productService.selectById(1));
        System.out.println(iUserService.selectById(1));
        System.out.println(userService1.selectById(1));
        System.out.println(userService2.selectById(1));
        return testService.test();
    }

}
