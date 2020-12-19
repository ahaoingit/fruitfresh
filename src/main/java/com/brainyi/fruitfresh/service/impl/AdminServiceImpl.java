package com.brainyi.fruitfresh.service.impl;

import com.brainyi.fruitfresh.entity.Admin;
import com.brainyi.fruitfresh.mapper.AdminMapper;
import com.brainyi.fruitfresh.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
