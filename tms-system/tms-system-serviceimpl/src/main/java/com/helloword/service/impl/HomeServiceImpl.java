package com.helloword.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.helloword.entity.Scenic;
import com.helloword.entity.ScenicExample;
import com.helloword.mapper.ScenicMapper;
import com.helloword.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class HomeServiceImpl  implements HomeService{

    @Autowired
    ScenicMapper scenicMapper;

    /**
     * 获取所有的景区信息
     * @return
     */
    @Override
    public List<Scenic> findAllScenic() {
        return scenicMapper.selectByExample(new ScenicExample());
    }
}
