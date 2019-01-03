package com.moqiao.controller;

import com.moqiao.message.*;
import com.moqiao.service.StandardService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * 7个判断指标
 */
@RestController
@RequestMapping("/standard")
public class StandardController {
    @Autowired
    private StandardService standardService;

    @ApiOperation(value = "传感器温度查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "storey", value = "查询层数", dataType = "BigDecimal", required = true),
            @ApiImplicitParam(name = "parts", value = "查询承台(承台1，承台2)", dataType = "String", required = true)
    }
    )
    @GetMapping(value = "/getSensorTemp")
    public List<SensorTempMessage> getSensorTempByStorey(BigDecimal storey,String parts){
        //调用service
        return standardService.getSensorTempByStorey(storey,parts);
    }

    @ApiOperation(value = "混凝土温度查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "storey", value = "查询层数", dataType = "BigDecimal", required = true),
            @ApiImplicitParam(name = "parts", value = "查询承台(承台1，承台2)", dataType = "String", required = true)
    })
    @GetMapping(value = "/ConcreteTemp")
    public List<ConcreteTempMessage> getConcreteTempByStorey(BigDecimal storey,String parts){
        return standardService.getConcreteTempByStorey(storey,parts);
    }

    @ApiOperation(value = "通过层数获取里表温差")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "storey", value = "层数", dataType = "BigDecimal",required = true),
            @ApiImplicitParam(name = "parts", value = "查询承台(承台1，承台2)", dataType = "String", required = true)
    })
    @GetMapping("/iodiffTemp")
    public List<IODiffTempMessage> getIODiffTempByStorey(BigDecimal storey,String parts){
        //调用service
        return standardService.getIODiffTempByStorey(storey,parts);

    }

    @ApiOperation(value = "获取层间温差")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "storey", value = "层数，1代表1层-2层，2代表2层-3层",dataType = "BigDecimal",required = true),
            @ApiImplicitParam(name = "parts", value = "查询承台(承台1，承台2)", dataType = "String", required = true)
    })
    @GetMapping("/itemDiffTemp")
    public List<ItemDiffTempMessage> getItemDiffTempByStory(int storey,String parts){
        //调用service
        return standardService.getItemDiffTempByStory(storey,parts);
    }

    @ApiOperation(value = "获取水温温升")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "storey", value = "层数",dataType = "BigDecimal",required = true),
            @ApiImplicitParam(name = "parts", value = "查询承台(承台1，承台2)", dataType = "String", required = true)
    })
    @GetMapping("/getWaterTemp")
    public List<WaterTempMessage> getWaterTempByStory(BigDecimal storey,String parts){
        //调用service
        return standardService.getWaterTempByStory(storey,parts);
    }

    @ApiOperation(value = "获取表面与环境温差")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "storey", value = "层数",dataType = "BigDecimal",required = true),
            @ApiImplicitParam(name = "parts", value = "查询承台(承台1，承台2)", dataType = "String", required = true)
    })
    @GetMapping("/getSurEnvTempDiff")
    public List<SurEnvTempDiffMessage> getSurEnvTempDiffByStorey(BigDecimal storey,String parts){
        //调用service
        return standardService.selectSurEnvTempDiffByStorey(storey,parts);
    }

    @ApiOperation(value = "降温速率")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "storey", value = "层数",dataType = "BigDecimal",required = true),
            @ApiImplicitParam(name = "parts", value = "查询承台(承台1，承台2)", dataType = "String", required = true)
    })
    @GetMapping("/getCoolingRate")
    public List<CoolingRateMessage> getCoolingRateByStorey(BigDecimal storey,String parts){
        //调用service
        return standardService.selectCoolingRateByStorey(storey,parts);
    }

}
