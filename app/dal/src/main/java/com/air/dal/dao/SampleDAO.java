package com.air.dal.dao;

import com.air.dal.modal.UserDO;
import org.apache.ibatis.annotations.*;

/**
 * @author lx48475
 * @version Id: SampleDAO.java, v 0.1 2017年07月31 15:21 lx48475 Exp $
 */
@Mapper
public interface SampleDAO {

    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "userName", column = "user_name"),
        @Result(property = "password", column = "password"),
        @Result(property = "description", column = "description")
    })

    @Insert("INSERT INTO user (id, user_name, password, description) VALUES (#{id}, #{userName}, #{password}, #{description})")
    public void create(UserDO user);

    @Delete("DELETE FROM user WHERE id = #{id}")
    public void delete(UserDO user);

    @Update("UPDATE user SET user_name = #{userName}, password = #{password}, description = #{description}")
    public void update(UserDO user);

    @Select("SELECT * FROM user WHERE id = #{id}")
    public UserDO get(long id);
}
