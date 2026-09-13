package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * @version: java version 1.8
 * @Author: Mr Orange
 * @description:
 * @date: 2026-08-21 01:40
 */
@Mapper
public interface UserMapper {



    /**
     * 根据openid查询用户
     * @param openid
     * @return
     */
    @Select("select * from user where openid = #{openid}")
    User getByOpenid(String openid);

    /**
     * 插入数据
     * @param user
     */
    void insert(User user);

    /**
     * 根据userid查询用户
     * @param userId
     * @return
     */
    @Select("select * from user where id = #{userid}")
    User getByUserId(Long userId);

    /**
     * 根据动态条件查询用户数量
     * @param map
     * @return
     */
    Integer countByMap(Map map);
}
