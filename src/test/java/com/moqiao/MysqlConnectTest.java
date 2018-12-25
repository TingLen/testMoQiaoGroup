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
//    @Autowired
    private  WorkUserExample workUserExample;
    @Autowired
    private WorkUserMapper workUserMapper;
//    @Autowired
//    private WorkUser workUser;
    @Before
    public void before(){
        this.workUserExample = new WorkUserExample();
    }

    @Test
    public void connectTest(){
        workUserExample.or().andUsernameEqualTo("lmh111");
         workUserMapper.countByExample(workUserExample);
//        Assert.assertEquals(1,workUserList.size());
    }

    @Test
    public void findByNameTest(){

    }
}
