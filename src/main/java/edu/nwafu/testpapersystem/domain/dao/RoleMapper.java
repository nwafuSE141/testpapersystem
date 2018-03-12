package edu.nwafu.testpapersystem.domain.dao;

import edu.nwafu.testpapersystem.domain.entity.Role;
import java.util.List;

public interface RoleMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(Role record);

    
    Role selectByPrimaryKey(Integer id);

    
    List<Role> selectAll();

    
    int updateByPrimaryKey(Role record);
}