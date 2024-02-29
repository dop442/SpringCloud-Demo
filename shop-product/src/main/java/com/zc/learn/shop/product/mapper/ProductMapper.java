package com.zc.learn.shop.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zc.learn.shop.bean.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper extends BaseMapper<Product> {

    /**
     * @Description 扣减商品库存
     */
    int updateProductStockById(@Param("count") Integer count, @Param("id") Long id);
}
