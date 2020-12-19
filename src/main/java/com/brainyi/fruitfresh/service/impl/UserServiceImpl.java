package com.brainyi.fruitfresh.service.impl;

import com.brainyi.fruitfresh.entity.User;
import com.brainyi.fruitfresh.mapper.UserMapper;
import com.brainyi.fruitfresh.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
