package com.brainyi.fruitfresh.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.brainyi.fruitfresh.entity.Admin;
import com.brainyi.fruitfresh.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ahao
 * @since 2020-12-18
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminMapper adminMapper;
    @RequestMapping("/getAdmin")
    public List<Admin> getAdmin() {
        QueryWrapper<Admin> objectQueryWrapper = new QueryWrapper<>();
        return adminMapper.selectList(objectQueryWrapper);
    }
}

