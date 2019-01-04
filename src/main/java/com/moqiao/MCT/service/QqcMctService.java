package com.moqiao.MCT.service;

import com.moqiao.MCT.dao.mapper.QqcMctMapper;
import com.moqiao.MCT.message.QqcMessage;
import com.moqiao.MCT.pojo.QqcMct;
import com.moqiao.MCT.pojo.QqcMctExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class QqcMctService {
    @Autowired
    private QqcMctMapper qqcMctMapper;

    private  QqcMctExample qqcMctExample=new QqcMctExample();
    /**
    * @Description:根据时间顺序获取所有合并的Guid
    * @Author: yu
    * @Date: 2018/12/28
    */
    public List<QqcMct> getPriGuid(String Parts) {
        List<QqcMct> qqcmctlist=qqcMctMapper.selectPriGuid(Parts);
        return  qqcmctlist;
    }
    /**
    * @Description:根据Guid获取首页的三维图数据
    * @Author: yu
    * @Date: 2018/12/28
    */
    public List<QqcMessage> getQqcMessage(List<QqcMct> qqcmctlist) throws Exception {
        List<QqcMessage> resultMctlist=new ArrayList<QqcMessage>();
//        long now;
//        long sum = 0;
//        long s=0;
//        now = System.currentTimeMillis();
        for (QqcMct mct:qqcmctlist) {
            //根据相同的guid找到当前的七个点数据
            qqcMctExample=new QqcMctExample();
            qqcMctExample.or().andGuidEqualTo(mct.getGuid());
            List<QqcMct>  mctlist=qqcMctMapper.selectByExample(qqcMctExample);
//            List<QqcMct>  mctlist=qqcMctMapper.selectByGuid(mct.getGuid());
//            System.out.println("get-set耗时"+(System.currentTimeMillis() - now) + "ms秒，和是" +s++);
            if (mctlist!=null){
                QqcMessage  resultQqcMessage=new QqcMessage();
                for (QqcMct mct1:mctlist) {
                    //遍历并组合返回参数
                    resultQqcMessage.setDATETIME(mct1.getDatetime());
                    resultQqcMessage.setCOLDWATER_TEMP1(mct1.getColdwaterTemp1());
                    resultQqcMessage.setCOLDWATER_TEMP2(mct1.getColdwaterTemp2());
                    resultQqcMessage.setET(mct1.getEt());
                    resultQqcMessage.setHOTWATER_TEMP1(mct1.getHotwaterTemp1());
                    //七个点
                    List<BigDecimal> _temps=new ArrayList<BigDecimal>();
                    _temps.add(mct1.getConTemp1());
                    _temps.add(mct1.getConTemp2());
                    _temps.add(mct1.getConTemp3());
                    _temps.add(mct1.getConTemp4());
                    _temps.add(mct1.getConTemp5());
                    _temps.add(mct1.getConTemp6());
                    _temps.add(mct1.getConTemp7());

//                    Map<String,Object> map = new HashMap<String,Object>();
//                    map.put("_temps"+mct1.getStorey(),_temps);
                    //利用反射赋值
                    NumberFormat nf = NumberFormat.getInstance();
                    String filedName1 = "_temps"+nf.format(mct1.getStorey());
                    Field name = resultQqcMessage.getClass().getDeclaredField(filedName1);
                    name.setAccessible(true);
                    name.set(resultQqcMessage,_temps);
                    name.setAccessible(false);
                }

                resultMctlist.add(resultQqcMessage);
            }
        }

        return resultMctlist;
    }
}
