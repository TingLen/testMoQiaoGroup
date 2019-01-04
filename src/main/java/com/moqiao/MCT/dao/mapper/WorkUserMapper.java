package com.moqiao.MCT.dao.mapper;

import com.moqiao.MCT.pojo.WorkUser;
import com.moqiao.MCT.pojo.WorkUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkUserMapper {
    long countByExample(WorkUserExample example);

    int deleteByExample(WorkUserExample example);

    int deleteByPrimaryKey(String usercode);

    int insert(WorkUser record);

    int insertSelective(WorkUser record);

    List<WorkUser> selectByExample(WorkUserExample example);

    WorkUser selectByPrimaryKey(String usercode);

    int updateByExampleSelective(@Param("record") WorkUser record, @Param("example") WorkUserExample example);

    int updateByExample(@Param("record") WorkUser record, @Param("example") WorkUserExample example);

    int updateByPrimaryKeySelective(WorkUser record);

    int updateByPrimaryKey(WorkUser record);
}