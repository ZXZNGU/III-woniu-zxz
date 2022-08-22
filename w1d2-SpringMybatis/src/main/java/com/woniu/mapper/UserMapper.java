package com.woniu.mapper;

import com.woniu.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    @Insert("insert into smbms_user(username,usercode,birthday,roleid) values(#{userName},#{userCode},#{birthday},#{roleid})")
    public void addUser(User user);

    public void updateUser(User user);

    @Delete("delete from smbms_user where id = #{id}")
    public void deleteUserById(Integer id);

    @Select("select * from smbms_user where id = #{id}")
    public User getUserById(Integer id);

    @Select("select * from smbms_user")
    public List<User> findAllUsers();
}
