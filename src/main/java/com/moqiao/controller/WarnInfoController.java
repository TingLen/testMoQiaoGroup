package com.moqiao.controller;

import com.moqiao.dao.mapper.QqcMctwarningnewMapper;
import com.moqiao.pojo.QqcMctwarningnew;
import com.moqiao.pojo.QqcMctwarningnewExample;
import com.moqiao.service.WarnInfoService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/GetWarningData")
public class WarnInfoController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private WarnInfoService warnInfoService;

    @ApiOperation(value="预警信息", notes="获取预警数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Parts", value = "承台部位", required = true, dataType = "String"),
            @ApiImplicitParam(name = "type", value = "预警类型", required = false,dataType = "String")
    })
    @RequestMapping(value = "/getwarn",method=RequestMethod.GET)
    @ResponseBody
    private List<QqcMctwarningnew> getWarnList(String Parts , String type)
    {
        List<QqcMctwarningnew> qqcMctwarningnewList=new ArrayList<QqcMctwarningnew>();

        qqcMctwarningnewList=warnInfoService.getWarningData(Parts,type);

        return qqcMctwarningnewList;
    }

}
