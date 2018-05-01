package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.Role;
import java.util.List;

public interface RoleMapper extends BaseMapper<Role,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(Role record);

    
    Role selectByPrimaryKey(Integer id);

    
    List<Role> selectAll();

    
    int updateByPrimaryKey(Role record);
}