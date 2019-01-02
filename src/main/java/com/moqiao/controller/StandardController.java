package com.moqiao.controller;

import com.moqiao.message.*;
import com.moqiao.service.StandardService;
import io.swagger.annotations.ApiImplicitParam;
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
    @ApiImplicitParam(name = "storey", value = "查询层数", dataType = "BigDecimal", required = true)
    @GetMapping(value = "/getSensorTemp")
    public List<SensorTempMessage> getSensorTempByStorey(BigDecimal storey){
        //调用service
        return standardService.getSensorTempByStorey(storey);
    }

    @ApiOperation(value = "混凝土温度查询")
    @ApiImplicitParam(name = "storey", value = "查询层数", dataType = "BigDecimal", required = true)
    @GetMapping(value = "/ConcreteTemp")
    public List<ConcreteTempMessage> getConcreteTempByStorey(BigDecimal storey){
        return standardService.getConcreteTempByStorey(storey);
    }

    @ApiOperation(value = "通过层数获取里表温差")
    @ApiImplicitParam(name = "storey", value = "层数", dataType = "BigDecimal",required = true)
    @GetMapping("/iodiffTemp")
    public List<IODiffTempMessage> getIODiffTempByStorey(BigDecimal storey){
        //调用service
        return standardService.getIODiffTempByStorey(storey);

    }

    @ApiOperation(value = "获取层间温差")
    @ApiImplicitParam(name = "storey", value = "层数，1代表1层-2层，2代表2层-3层",dataType = "BigDecimal",required = true)
    @GetMapping("/itemDiffTemp")
    public List<ItemDiffTempMessage> getItemDiffTempByStory(int storey){
        //调用service
        return standardService.getItemDiffTempByStory(storey);
    }

    @ApiOperation(value = "获取水温温升")
    @ApiImplicitParam(name = "storey", value = "层数",dataType = "BigDecimal",required = true)
    @GetMapping("/getWaterTemp")
    public List<WaterTempMessage> getWaterTempByStory(BigDecimal storey){
        //调用service
        return standardService.getWaterTempByStory(storey);
    }

    @ApiOperation(value = "获取表面与环境温差")
    @ApiImplicitParam(name = "storey", value = "层数",dataType = "BigDecimal",required = true)
    @GetMapping("/getSurEnvTempDiff")
    public List<SurEnvTempDiffMessage> getSurEnvTempDiffByStorey(BigDecimal storey){
        //调用service
        return standardService.selectSurEnvTempDiffByStorey(storey);
    }

}
