package com.moqiao;

import com.moqiao.dao.mapper.WorkUserMapper;
import com.moqiao.pojo.WorkUser;
import com.moqiao.pojo.WorkUserExample;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MysqlConnectTest {
    private  WorkUserExample workUserExample;

    @Autowired
    private WorkUserMapper workUserMapper;

    @Autowired
    private WorkUser workUser;

    @Before
    public void before(){
        this.workUserExample = new WorkUserExample();
    }

    @Test
    public void findByNameTest(){
        workUserExample.or().andUsercodeEqualTo("admin");
        List<WorkUser> workUserList = workUserMapper.selectByExample(workUserExample);
        Assert.assertEquals(1,workUserList.size());
    }
}
