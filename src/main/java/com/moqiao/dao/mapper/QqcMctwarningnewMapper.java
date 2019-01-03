package com.moqiao.dao.mapper;

import com.moqiao.pojo.QqcMctwarningnew;
import com.moqiao.pojo.QqcMctwarningnewExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface QqcMctwarningnewMapper {
    long countByExample(QqcMctwarningnewExample example);

    int deleteByExample(QqcMctwarningnewExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(QqcMctwarningnew record);

    int insertSelective(QqcMctwarningnew record);

    List<QqcMctwarningnew> selectByExampleWithBLOBs(QqcMctwarningnewExample example);

    List<QqcMctwarningnew> selectByExample(QqcMctwarningnewExample example);

    QqcMctwarningnew selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") QqcMctwarningnew record, @Param("example") QqcMctwarningnewExample example);

    int updateByExampleWithBLOBs(@Param("record") QqcMctwarningnew record, @Param("example") QqcMctwarningnewExample example);

    int updateByExample(@Param("record") QqcMctwarningnew record, @Param("example") QqcMctwarningnewExample example);

    int updateByPrimaryKeySelective(QqcMctwarningnew record);

    int updateByPrimaryKeyWithBLOBs(QqcMctwarningnew record);

    int updateByPrimaryKey(QqcMctwarningnew record);
    List<QqcMctwarningnew> selectwarndata(Map<String,Object> map);
}