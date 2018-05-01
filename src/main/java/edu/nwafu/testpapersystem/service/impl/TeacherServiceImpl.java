package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.entity.Teacher;
import edu.nwafu.testpapersystem.domain.mapper.TeacherMapper;
import edu.nwafu.testpapersystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl extends BaseServiceImpl<Teacher,Integer> implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public BaseMapper<Teacher, Integer> getBaseMapper() {
        return teacherMapper;
    }
}
