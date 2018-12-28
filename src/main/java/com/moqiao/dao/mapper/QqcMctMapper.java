package com.moqiao.dao.mapper;

import com.moqiao.message.ConcreteTempMessage;
import com.moqiao.pojo.QqcMct;
import com.moqiao.pojo.QqcMctExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QqcMctMapper {
    long countByExample(QqcMctExample example);

    int deleteByExample(QqcMctExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(QqcMct record);

    int insertSelective(QqcMct record);

    List<QqcMct> selectByExample(QqcMctExample example);

    QqcMct selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") QqcMct record, @Param("example") QqcMctExample example);

    int updateByExample(@Param("record") QqcMct record, @Param("example") QqcMctExample example);

    int updateByPrimaryKeySelective(QqcMct record);

    int updateByPrimaryKey(QqcMct record);

    List<ConcreteTempMessage> selectConcreteTempByStorey(BigDecimal storey);
}