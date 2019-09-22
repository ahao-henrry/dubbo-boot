package com.ahao.dubbo.consumer.service;

import com.ahao.dubbo.bean.UserVO;

/**
 * @author ahao
 * @since 2019/9/15 下午10:21
 */
public interface IUserService {
    UserVO getById(Integer id);
}
