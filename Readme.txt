
    
fix issue:"'sell.hibernate_sequence' doesn't exist"
>>@GeneratedValue(strategy = GenerationType.IDENTITY)


下单测试流程
1，传入订单信息，包含两个信息：需要购买的商品id和购买商品的数量
2，根据商品id，查询商品
   查询总价
   订单详情（orderDetail）入库
   订单数据（orderMaster）入库
   扣库存

