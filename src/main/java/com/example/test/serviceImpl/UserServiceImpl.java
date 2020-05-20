package com.example.test.serviceImpl;

import com.example.test.bean.UserBean;
import com.example.test.mapper.UserMapper;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author xbt
 * @Date 2020/5/10 17:23
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    //将Dao注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}
