package com.yao.boot2.mapper;

import com.yao.boot2.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    Integer findUser(User user);
}
