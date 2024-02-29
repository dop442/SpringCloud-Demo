package com.zc.learn.shop.bean;

import com.baomidou.mybatisplus.annotation.*;
import com.zc.learn.shop.utils.id.SnowFlakeFactory;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName("t_product")
public class Product implements Serializable {
    private static final long serialVersionUID = -2907409980909070073L;

    @TableId(value = "id", type = IdType.INPUT)
    @TableField(value = "id", fill = FieldFill.INSERT)
    private Long id;

    /**
     * 商品名称
     */
    @TableField("t_pro_name")
    private String proName;


    /**
     * 商品名称
     */
    @TableField("t_pro_price")
    private BigDecimal proPrice;


    /**
     * 商品库存
     */
    @TableField("t_pro_stock")
    private Integer proStock;


    public Product(){
        this.id = SnowFlakeFactory.getSnowFlake().nextId();
    }


}
