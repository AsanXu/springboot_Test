package com.example.test.service;

import com.example.test.bean.UserBean;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author xbt
 * @Date 2020/5/10 17:22
 * @Version 1.0
 */
public interface UserService {

    UserBean loginIn(String name,String password);

}
