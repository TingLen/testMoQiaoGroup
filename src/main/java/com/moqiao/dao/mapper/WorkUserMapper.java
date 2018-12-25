package com.moqiao.dao.mapper;

import com.moqiao.pojo.WorkUser;
import com.moqiao.pojo.WorkUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
<<<<<<< HEAD

=======
@Mapper
>>>>>>> tangyq
public interface WorkUserMapper {
    long countByExample(WorkUserExample example);

    int deleteByExample(WorkUserExample example);

    int deleteByPrimaryKey(String usercode);

    int insert(WorkUser record);

    int insertSelective(WorkUser record);

    List<WorkUser> selectByExampleWithBLOBs(WorkUserExample example);

    List<WorkUser> selectByExample(WorkUserExample example);

    WorkUser selectByPrimaryKey(String usercode);

    int updateByExampleSelective(@Param("record") WorkUser record, @Param("example") WorkUserExample example);

    int updateByExampleWithBLOBs(@Param("record") WorkUser record, @Param("example") WorkUserExample example);

    int updateByExample(@Param("record") WorkUser record, @Param("example") WorkUserExample example);

    int updateByPrimaryKeySelective(WorkUser record);

    int updateByPrimaryKeyWithBLOBs(WorkUser record);

    int updateByPrimaryKey(WorkUser record);
}