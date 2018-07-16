package com.liyingyu.multidatasource.dao.one;

import com.liyingyu.multidatasource.entity.one.UserOne;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Yingyu Li
 * @create 2018-07-13 17:59
 **/

@Component
public interface UserOneDao {

    @Select("select * from user")
    List<UserOne> getUsers();

    @Select("select * from user where id=#{id}")
    UserOne getUserById(@Param("id") int id);

    @Update("update user set name=#{name} where id=#{id}")
    Integer updateUser(@Param("id") Integer id, @Param("name") String name);

}
