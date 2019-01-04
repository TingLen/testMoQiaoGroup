package com.moqiao.MCT.service.impl;

import com.moqiao.MCT.dao.mapper.QqcMctwarningnewMapper;
import com.moqiao.MCT.pojo.QqcMctwarningnew;
import com.moqiao.MCT.pojo.QqcMctwarningnewExample;
import com.moqiao.MCT.service.WarnInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WarnInfoServiceImpl implements WarnInfoService {

    @Autowired
    private QqcMctwarningnewMapper qqcMctwarningnewMapper;
    private QqcMctwarningnewExample qqcMctwarningnewExample=new QqcMctwarningnewExample();
    @Override
    public List<QqcMctwarningnew> getWarningData(String Parts , String type){
        //qqcMctwarningnewExample.or().andWarntyepEqualTo(getWarningType(type));
        //return qqcMctwarningnewMapper.selectByExampleWithBLOBs(qqcMctwarningnewExample);
       Map<String,Object> map =new HashMap<>();
       map.put("Parts",Parts);
       map.put("warn_type",getWarningType(type));
       return qqcMctwarningnewMapper.selectwarndata(map);
    }
    private String getWarningType(String type)
    {
        String warn_type;
        if (type ==null)
            return null;
        switch (type)
        {
            case "1":
                warn_type="降温速率";
                break;
            case "2":
                warn_type="水温温升";
                break;
            case "3":
                warn_type="层间温差";
                break;
            case "4":
                warn_type="里表温差";
                break;
            case "5":
                warn_type="混凝土温度";
                break;
               default:
                   warn_type="";
                   break;
        }
        return warn_type;
    }
}
