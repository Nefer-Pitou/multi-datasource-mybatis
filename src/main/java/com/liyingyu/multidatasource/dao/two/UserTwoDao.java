package com.liyingyu.multidatasource.dao.two;

import com.liyingyu.multidatasource.entity.two.UserTwo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Yingyu Li
 * @create 2018-07-13 17:59
 **/

@Component
public interface UserTwoDao {
    @Select("select * from user")
    List<UserTwo> getUsers();
}
