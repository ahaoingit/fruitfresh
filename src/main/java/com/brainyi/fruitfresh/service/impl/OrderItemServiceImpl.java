package com.brainyi.fruitfresh.service.impl;

import com.brainyi.fruitfresh.entity.OrderItem;
import com.brainyi.fruitfresh.mapper.OrderItemMapper;
import com.brainyi.fruitfresh.service.IOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单商品表 服务实现类
 * </p>
 *
 * @author ahao
 * @since 2020-12-18
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

}
