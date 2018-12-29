package com.moqiao.service.impl;

import com.moqiao.dao.mapper.QqcMctwarningnewMapper;
import com.moqiao.pojo.QqcMctwarningnew;
import com.moqiao.pojo.QqcMctwarningnewExample;
import com.moqiao.service.WarnInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.annotation.WebServlet;
import java.util.List;

@Service
public class WarnInfoServiceImpl implements WarnInfoService {

    @Autowired
    private QqcMctwarningnewMapper qqcMctwarningnewMapper;
    private QqcMctwarningnewExample qqcMctwarningnewExample=new QqcMctwarningnewExample();
    @Override
    public List<QqcMctwarningnew> getWarningData(String Parts , String type){

        qqcMctwarningnewExample.or().andWarntyepEqualTo(getWarningType(type));

        return qqcMctwarningnewMapper.selectByExampleWithBLOBs(qqcMctwarningnewExample);
        //return qqcMctwarningnewMapper.selectwarndata(getWarningType(type));
    }
    private String getWarningType(String type)
    {
        String warn_type;
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
