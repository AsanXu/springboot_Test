package com.example.test.mapper;

import com.example.test.bean.UserBean;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author xbt
 * @Date 2020/5/10 17:22
 * @Version 1.0
 */
public interface UserMapper {

    UserBean getInfo(String name,String password);

}
