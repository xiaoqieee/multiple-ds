package com.hawcore.framework.multiplyds.service.db.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hawcore.framework.multiplyds.entity.db.User;
import com.hawcore.framework.multiplyds.mapper.db.UserMapper;
import com.hawcore.framework.multiplyds.service.db.IUserService;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hawcore
 * @since 2019-07-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public String test() {
        return "Hello world";
    }

    @Override
    public boolean insert(User entity) {
        return super.insert(entity);
    }

    @Override
    public boolean deleteById(Serializable id) {
        return super.deleteById(id);
    }

    @Override
    public User selectById(Serializable id) {
        return super.selectById(id);
    }
}
