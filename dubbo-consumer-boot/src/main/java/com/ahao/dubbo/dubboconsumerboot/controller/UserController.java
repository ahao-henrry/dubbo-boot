package com.ahao.dubbo.dubboconsumerboot.controller;

import com.ahao.dubbo.bean.ResultDTO;
import com.ahao.dubbo.bean.UserVO;
import com.ahao.dubbo.consumer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ahao
 * @since 2019/9/16 下午9:07
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") Integer id) {
        UserVO user = iUserService.getById(id);
        return ResultDTO.success(user);
    }
}
