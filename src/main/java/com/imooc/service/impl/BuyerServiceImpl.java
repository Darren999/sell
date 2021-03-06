package com.imooc.service.impl;

import com.imooc.dto.OrderDTO;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.service.BuyerService;
import com.imooc.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private OrderService orderService;

    @Override
    public OrderDTO findOneOrder(String openId, String orderId) {
        return checkOrderOwner(openId,orderId);
    }

    @Override
    public OrderDTO cancelOneOrder(String openId, String orderId) {
        OrderDTO orderDTO= checkOrderOwner(openId,orderId);
        if(orderDTO == null){
            log.error("[取消订单]查询不到该订单");
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }

        OrderDTO result = orderService.cancel(orderDTO);
        return result;
    }

    private OrderDTO checkOrderOwner(String openId, String orderId){
        OrderDTO orderDTO = orderService.findById(orderId);
        if(orderDTO == null){
            return null;
        }

        if(!orderDTO.getBuyerOpenid().equalsIgnoreCase(openId)){
            log.error("[查询订单]订单的openid不一致，openid={},orderId={}",openId,orderDTO);
            throw new SellException(ResultEnum.ORDER_OWNER_ERR);
        }
        return orderDTO;
    }
}
