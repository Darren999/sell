package com.imooc.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    PARAM_ERROR(1,"参数不正确"),
    PRODUCT_NOT_EXIT(10,"商品不存在"),
    PRODUCT_STOCK_ERROR(11,"库存不足"),
    ORDER_NOT_EXIST(12,"订单不存在"),
    ORDERDETAIL_NOT_EXIST(13,"订单详情不存在"),
    ORDER_STATUS_ERROR(14,"订单状态错误"),
    ORDER_UPDATE_ERROR(15,"订单更新错误"),
    ORDER_DETAIL_EMPTY(16,"订单详情为空"),
    ORDER_PAY_STATUS_ERROR(17,"订单支付状态错误"),
    CART_EMPTY(18,"购物车为空"),
    ORDER_OWNER_ERR(19,"不属于当前用户的订单"),
    WECHAT_MP_ERR(20,"微信公众号错误"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
