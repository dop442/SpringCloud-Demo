package com.zc.learn.shop.bean;

import lombok.Data;

@Data
public class OrderParams {

    private Long productId;

    private Long userId;

    private Integer count;

    public boolean isEmpty(){
        return (productId == null || productId <= 0) ||
                (userId == null || productId <= 0) ||
                (count == null || count <= 0);

    }


}
