package com.moqiao.controller;

import com.moqiao.message.ConcreteTempMessage;
import com.moqiao.message.IODiffTempMessage;
import com.moqiao.message.SensorTempMessage;
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

}
