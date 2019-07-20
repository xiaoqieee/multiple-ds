package com.hawcore.framework.multiplyds.service.db2.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hawcore.framework.multiplyds.entity.db2.User;
import com.hawcore.framework.multiplyds.mapper.db2.UserMapper2;
import com.hawcore.framework.multiplyds.service.db2.IUserService2;
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
public class UserService2Impl extends ServiceImpl<UserMapper2, User> implements IUserService2 {

    @Override
    public boolean insert(User entity) {
        return super.insert(entity);
    }

    @Override
    public boolean deleteById(Serializable id) {
        return super.deleteById(id);
    }

    @Override
    public boolean updateById(User entity) {
        return super.updateById(entity);
    }

    @Override
    public User selectById(Serializable id) {
        return super.selectById(id);
    }
}
