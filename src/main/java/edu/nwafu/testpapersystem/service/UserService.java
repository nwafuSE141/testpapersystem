package edu.nwafu.testpapersystem.service;


import edu.nwafu.testpapersystem.Base.BaseService;
import edu.nwafu.testpapersystem.domain.entity.User;

public interface UserService extends BaseService<User,Integer> {

    User findByNameAndRoleId(String name, Integer roleId);

}
