package com.imooc.service;

import com.imooc.dto.OrderDTO;

public interface BuyerService {
    //查询订单
    OrderDTO findOneOrder(String openId,String orderId);

    //取消订单
    OrderDTO cancelOneOrder(String openId,String orderId);

}
