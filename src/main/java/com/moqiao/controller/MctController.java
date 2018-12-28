package com.moqiao.controller;

import com.moqiao.dao.mapper.QqcMctMapper;
import com.moqiao.message.LoginMessage;
import com.moqiao.message.QqcMessage;
import com.moqiao.pojo.QqcMct;
import com.moqiao.pojo.QqcMctExample;
import com.moqiao.service.QqcMctService;
import com.moqiao.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mct")
public class MctController {

    @Autowired
    private QqcMctService qqcMctService;
    @Autowired
    private QqcMctMapper qqcMctMapper;

    private QqcMctExample qqcMctExample=new QqcMctExample();
    /**
     * @Author: yu
     * @Date: 2018/12/27
     */
    @ApiOperation(value = "获取首页的三维图数据")
    @ApiImplicitParam(name = "Parts", value = "部位（承台1，承台2）",dataType = "String",required = true)
    @RequestMapping(value = "/Chart3d", method = RequestMethod.GET)
    public List<QqcMessage> Chart3d(String Parts) throws Exception{
        List<QqcMessage> resultMctlist=new ArrayList<QqcMessage>();

        //根据时间顺序获取所有合并的Guid
        List<QqcMct> qqcmctlist=qqcMctService.getPriGuid(Parts);
        if (qqcmctlist!=null)
        {
            resultMctlist=qqcMctService.getQqcMessage(qqcmctlist);
        }
        return  resultMctlist;
    }
}
