package com.zc.learn.shop.product.controller;


import com.alibaba.fastjson.JSONObject;
import com.zc.learn.shop.bean.Product;
import com.zc.learn.shop.product.service.ProductService;
import com.zc.learn.shop.utils.constants.HttpCode;
import com.zc.learn.shop.utils.resp.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/get/{pid}")
    public Product getProduct(@PathVariable("pid") Long pid){
        Product product = productService.getProductById(pid);
        log.info("获得到的商品信息为：{}", JSONObject.toJSONString(product));
        return product;
    }

    @GetMapping(value = "/update_count/{pid}/{count}")
    public Result<Integer> updateCount(@PathVariable("pid") Long pid, @PathVariable("count") Integer count){
        int updateCount = productService.updateProductStockById(count, pid);
        log.info("更新商品pid：{}，购买数量：{}", pid, count);
        return new Result<>(HttpCode.SUCCESS, "执行成功", updateCount);
    }

}
