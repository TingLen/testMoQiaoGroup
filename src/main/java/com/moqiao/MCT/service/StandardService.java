package com.moqiao.MCT.service;

import com.moqiao.MCT.dao.mapper.QqcMctMapper;
import com.moqiao.MCT.message.*;
import com.moqiao.MCT.pojo.QqcMct;
import com.moqiao.MCT.pojo.QqcMctExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class StandardService {
    @Autowired
    private QqcMctMapper qqcMctMapper;
    @Autowired
    private QqcMct qqcMct;

    public List<SensorTempMessage> getSensorTempByStorey(BigDecimal storey,String parts){

        QqcMctExample example = new QqcMctExample();
        example.setOrderByClause("DATETIME");
        example.or().andStoreyEqualTo(storey).andPartsEqualTo(parts);
        //根据层数去数据库取值
        List<QqcMct> qqcMctList = qqcMctMapper.selectByExample(example);
        //将取出的值，赋值给SensorTempMessage类
        SensorTempMessage sensorTempMessage = new SensorTempMessage();
        List<SensorTempMessage> sensorTempMessageList = new ArrayList<>();
        for(QqcMct qqcMct : qqcMctList){
            sensorTempMessage.setDate(qqcMct.getDatetime());
            sensorTempMessage.setA(qqcMct.getConTemp1());
            sensorTempMessage.setB(qqcMct.getConTemp2());
            sensorTempMessage.setC(qqcMct.getConTemp3());
            sensorTempMessage.setD(qqcMct.getConTemp4());
            sensorTempMessage.setE(qqcMct.getConTemp5());
            sensorTempMessage.setF(qqcMct.getConTemp6());
            sensorTempMessage.setG(qqcMct.getConTemp7());
            sensorTempMessageList.add(sensorTempMessage);
        }
        return sensorTempMessageList;

    }


    public List<ConcreteTempMessage> getConcreteTempByStorey(BigDecimal storey,String parts){
        //根据层数取出混凝土温度，混凝土温度为7个传感器的最大温度值
        List<ConcreteTempMessage> concreteTempMessageList = qqcMctMapper.selectConcreteTempByStorey(storey,parts);
        return concreteTempMessageList;
    }

    public List<IODiffTempMessage> getIODiffTempByStorey(BigDecimal storey,String parts){

        return qqcMctMapper.selectIODiffTempByStorey(storey,parts);
    }

    public List<ItemDiffTempMessage> getItemDiffTempByStory(int storey,String parts){
        return qqcMctMapper.selectItemDiffTempByStorey(storey,parts);
    }

    public List<WaterTempMessage> getWaterTempByStory(BigDecimal storey,String parts){
        return qqcMctMapper.selectWaterTempByStorey(storey,parts);
    }
    public List<SurEnvTempDiffMessage> selectSurEnvTempDiffByStorey(BigDecimal storey,String parts){
        return qqcMctMapper.selectSurEnvTempDiffByStorey(storey,parts);
    }
    public List<CoolingRateMessage> selectCoolingRateByStorey(BigDecimal storey,String parts){
        return qqcMctMapper.selectCoolingRateByStorey(storey,parts);
    }
}
