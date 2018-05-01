package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.entity.Role;
import edu.nwafu.testpapersystem.domain.mapper.RoleMapper;
import edu.nwafu.testpapersystem.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role,Integer> implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public BaseMapper<Role, Integer> getBaseMapper() {
        return roleMapper;
    }
}
