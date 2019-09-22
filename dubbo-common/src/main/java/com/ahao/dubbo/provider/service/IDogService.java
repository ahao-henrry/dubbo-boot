package com.ahao.dubbo.provider.service;


import com.ahao.dubbo.bean.DogVO;

import java.util.List;

/**
 * @author ahao
 * @since 2019/9/15 下午9:50
 */
public interface IDogService {
    List<DogVO> getDog(Integer masterId);
}
