package com.helloword.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.helloword.entity.Scenic;
import com.helloword.entity.ScenicAccount;
import com.helloword.entity.ScenicExample;
import com.helloword.mapper.ScenicAccountMapper;
import com.helloword.mapper.ScenicMapper;
import com.helloword.service.HomeService;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Date;
import java.util.List;
@Service
public class HomeServiceImpl  implements HomeService{

    //qiniu
    private static final String  AK = "AopW6jDWoGJM_HjV3zaA1Rr77Tl_pgkK2KnNy5ZK";
    private static final String SK = "o1zzCmG_JalqW2QcGuXI8oec1HSq0KJfflJOZp0D";
    private static final String BUCKET = "qiniu";


    @Autowired
    ScenicMapper scenicMapper;
    @Autowired
    ScenicAccountMapper scenicAccountMapper;

    /**
     * 获取所有的景区信息
     * @return
     */
    @Override
    public List<Scenic> findAllScenic() {
        return scenicMapper.selectByExample(new ScenicExample());
    }

    /**
     * 获取上传凭证
     * @return
     */
    @Override
    public String getUploadToken() {
        Auth auth = Auth.create(AK,SK);
        StringMap putPolicy = new StringMap();
        putPolicy.put("returnBody", "{\"key\":\"$(key)\",\"hash\":\"$(etag)\",\"bucket\":\"$(bucket)\",\"fsize\":$(fsize)}");
        long expireSeconds = 3600;
        String upToken = auth.uploadToken(BUCKET, null, expireSeconds, putPolicy);

        return upToken;
    }

    /**
     * 新增scenic
     * @param scenic
     * @param scenicAccount
     */
    @Override
    public void saveScenic(Scenic scenic, ScenicAccount scenicAccount) {
        //补全 并向数据库中插入scenicAccount数据
        Date time = new Date();
        scenicAccount.setCreateTime(time);
        scenicAccount.setUpdateTime(time);
        scenicAccount.setAccountPhoto(scenic.getPhoto());

        scenicAccountMapper.insert(scenicAccount);

        //补全 并向数据库插入scenic数据
        scenic.setCreateTime(time);
        scenic.setUpdateTime(time);
        scenic.setAccountid(scenicAccount.getId());

        scenicMapper.insert(scenic);
    }

    @Override
    public Scenic findScenicById(int scenicId) {
        Scenic scenic = scenicMapper.selectByPrimaryKey(scenicId);
        //todo scenicAllMessage 页面中图片的替换
        return scenic;
    }
}
