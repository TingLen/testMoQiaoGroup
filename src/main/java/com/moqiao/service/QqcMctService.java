package com.moqiao.service;

import com.moqiao.dao.mapper.QqcMctMapper;
import com.moqiao.dao.mapper.WorkUserMapper;
import com.moqiao.pojo.QqcMctExample;
import com.moqiao.pojo.WorkUser;
import com.moqiao.pojo.WorkUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QqcMctService {
    @Autowired
    private QqcMctMapper qqcMctMapper;

    @Autowired
    private QqcMctExample qqcMctExample;

    /** 
    * @Description:获取首页的三维图数据
    * @Param: [Parts] 部位（承台1，承台2）
    * @return: java.lang.String 
    * @Author: yu
    * @Date: 2018/12/27 
    */ 
    public  String  Chart3d(String Parts){
        //根据时间顺序获取所有合并的Guid

        return "";
    }

}
