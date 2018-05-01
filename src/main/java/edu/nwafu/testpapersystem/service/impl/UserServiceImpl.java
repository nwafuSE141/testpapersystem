package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.mapper.UserMapper;
import edu.nwafu.testpapersystem.domain.entity.User;
import edu.nwafu.testpapersystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  extends BaseServiceImpl<User,Integer> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public BaseMapper<User, Integer> getBaseMapper() {
        return userMapper;
    }

    @Override
    public User findByNameAndRoleId(String name, Integer roleId) {
        return userMapper.findByNameAndRoleId(name,roleId);
    }
}
