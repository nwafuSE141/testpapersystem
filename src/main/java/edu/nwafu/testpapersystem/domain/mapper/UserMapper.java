package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(User record);

    
    User selectByPrimaryKey(Integer id);

    
    List<User> selectAll();

    
    int updateByPrimaryKey(User record);

    @Select("select * from user where name=#{name} and role_id=#{roleId} ")
    User findByNameAndRoleId(@Param("name") String name, @Param("roleId") Integer roleId);
}