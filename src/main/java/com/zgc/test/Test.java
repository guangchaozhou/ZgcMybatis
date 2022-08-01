package com.zgc.test;


import com.zgc.mybatis.MapperProxyFactory;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        UserMapper mapper = MapperProxyFactory.getMapper(UserMapper.class);
        List<User> zgc = mapper.getUser("zgc");
        System.out.println(zgc);

        User user = mapper.getUserById(1);
        System.out.println(user);

    }
}
