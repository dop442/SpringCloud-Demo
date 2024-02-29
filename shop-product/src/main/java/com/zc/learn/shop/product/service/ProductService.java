package com.zc.learn.shop.product.service;

import com.zc.learn.shop.bean.Product;

public interface ProductService {

    /**
     * @Description 根据商品id获取商品信息
     */
    Product getProductById(Long id);

    /**
     * @Description 扣减商品库存
     */
    int updateProductStockById(Integer count, Long id);

}
