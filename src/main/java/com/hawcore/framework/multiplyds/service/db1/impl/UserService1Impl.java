package com.hawcore.framework.multiplyds.service.db1.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hawcore.framework.multiplyds.entity.db1.User;
import com.hawcore.framework.multiplyds.mapper.db1.UserMapper1;
import com.hawcore.framework.multiplyds.service.db1.IUserService1;
import com.hawcore.framework.multiplyds.service.db2.IUserService2;
import com.hawcore.framework.multiplyds.util.PageResponseDTO;
import com.hawcore.framework.multiplyds.util.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author hawcore
 * @since 2019-07-19
 */
@Service
public class UserService1Impl extends ServiceImpl<UserMapper1, User> implements IUserService1 {

    @Autowired
    IUserService2 userService2;

    @Override
    public boolean insert(User entity) {
        return super.insert(entity);
    }

    @Override
    public boolean updateById(User entity) {
        return super.updateById(entity);
    }

    @Override
    public User selectById(Serializable id) {
        System.out.println("这里是内部调用db2:" + userService2.selectById(id));
        return super.selectById(id);
    }

    public PageResponseDTO<User> select(int page, int pageSize) {
        Page page1 = new Page(page, pageSize);
        page1 = selectPage(page1);

        return ResponseUtils.buildResult(page1);
    }
}
