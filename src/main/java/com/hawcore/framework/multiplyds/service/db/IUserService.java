package com.hawcore.framework.multiplyds.service.db;

import com.baomidou.mybatisplus.service.IService;
import com.hawcore.framework.multiplyds.entity.db.User;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hawcore
 * @since 2019-07-19
 */
public interface IUserService extends IService<User> {

    String test();

}
