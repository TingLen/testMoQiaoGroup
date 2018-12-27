package com.moqiao.service;

import com.moqiao.dao.mapper.WorkUserMapper;
import com.moqiao.pojo.WorkUser;
import com.moqiao.pojo.WorkUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private WorkUserMapper workUserMapper;

    private WorkUserExample example = new WorkUserExample();
    @Autowired
    private WorkUser workUser;

    public WorkUser login(String usercode, String userpassword){
        example.or().andUsercodeEqualTo(usercode).andUserpasswordEqualTo(userpassword);
        List<WorkUser> workUserList = workUserMapper.selectByExample(example);
        if(workUserList.size() > 0){
            return workUserList.get(0);
        }
        return null;
    }
}
