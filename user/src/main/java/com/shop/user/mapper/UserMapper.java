package com.shop.user.mapper;

import com.shop.Entithy.UserEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @Author:YangZP
 * @Description:
 * @Date:Created in 14:342018/3/29
 **/
@Repository
@Mapper
public interface UserMapper {
    @Insert(" INSERT INTO user (id,username,password,phone,mail,licence_pic,register_time,user_type,user_state,role_id)\n" +
            "        VALUES (#{id},#{username},#{password},#{phone},#{mail},#{licencePic},#{registerTime},#{userTypeEnum.code},#{userStateEnum.code},#{roleEntity.id})")
    int insertByUser(UserEntity user);
    @Select("SELECT *  FROM user where phone=#{phone}")
    @Results(id = "userResult",value = {
            @Result(property = "id",column = "id"),
            @Result(property = "username",column = "username"),
            @Result(property = "password",column = "password"),
            @Result(property = "phone",column = "phone"),
            @Result(property = "mail",column = "mail"),
            @Result(property = "registertTime",column = "register_time"),
            @Result(property = "UserTypeEnum",column = "user_type"),
            @Result(property = "UserStateEnum",column = "user_state")
    })
    UserEntity findUserByPhone(@Param("phone") String phone);
}
