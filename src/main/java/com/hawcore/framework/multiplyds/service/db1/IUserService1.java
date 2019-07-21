package com.hawcore.framework.multiplyds.service.db1;

import com.baomidou.mybatisplus.service.IService;
import com.hawcore.framework.multiplyds.entity.db1.User;
import com.hawcore.framework.multiplyds.util.PageResponseDTO;

import java.io.Serializable;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hawcore
 * @since 2019-07-19
 */
public interface IUserService1 extends IService<User> {

    PageResponseDTO<User> select(int page, int pageSize);
}
