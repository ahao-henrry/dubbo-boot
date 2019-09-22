package com.ahao.dubbo.dubboconsumerboot.service.impl;


import com.ahao.dubbo.bean.DogVO;
import com.ahao.dubbo.bean.UserVO;
import com.ahao.dubbo.consumer.service.IUserService;
import com.ahao.dubbo.provider.service.IDogService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ahao
 * @since 2019/9/15 下午9:41
 */
@Service
public class UserServiceImpl implements IUserService {
    @Reference(loadbalance = "random")
    private IDogService iDogService;

    @Override
    @HystrixCommand(fallbackMethod = "getByIdError")
    public UserVO getById(Integer id) {
        UserVO userVO = new UserVO();
        userVO.setId(1);
        userVO.setName("ahao");
        userVO.setAge(18);
        userVO.setGender(1);

        List<DogVO> dogs = iDogService.getDog(1);
        userVO.setDogs(dogs);
        return userVO;
    }

    public UserVO getByIdError(Integer id) {
        UserVO userVO = new UserVO();
        userVO.setId(1);
        userVO.setName("error name");
        userVO.setAge(18);
        userVO.setGender(1);

        return userVO;
    }
}
