package com.hawcore.framework.multiplyds.service.product.impl;

import com.hawcore.framework.multiplyds.entity.product.Product;
import com.hawcore.framework.multiplyds.mapper.product.ProductMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hawcore.framework.multiplyds.service.product.IProductService;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * <p>
 * 产品表 服务实现类
 * </p>
 *
 * @author hawcore
 * @since 2019-07-21
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Override
    public Product selectById(Serializable id) {
        return super.selectById(id);
    }
}
