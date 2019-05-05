package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Pageable;
import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterReposityTest {

    @Autowired
    private OrderMasterReposity reposity;

    @Test
    public void save() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyerName("猪师兄");
        orderMaster.setBuyerPhone("123456789");
        orderMaster.setBuyerAddress("天朝古都");
        orderMaster.setBuyerOpenid("110110");
        orderMaster.setOrderAmount(new BigDecimal(2.3));

        OrderMaster result = reposity.save(orderMaster);
        Assert.assertNotEquals(null,result);
    }

    @Test
    public void findByBuyerOpenid(){
        PageRequest request = new PageRequest(0,8);
        Page<OrderMaster> orderMasterPage = reposity.findByBuyerOpenid("110110",request);
        Assert.assertNotEquals(0,orderMasterPage.getTotalElements());
    }


}