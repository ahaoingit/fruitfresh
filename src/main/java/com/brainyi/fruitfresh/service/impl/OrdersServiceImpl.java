package com.brainyi.fruitfresh.service.impl;

import com.brainyi.fruitfresh.entity.Orders;
import com.brainyi.fruitfresh.mapper.OrdersMapper;
import com.brainyi.fruitfresh.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ahao
 * @since 2020-12-18
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
