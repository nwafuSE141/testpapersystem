package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.mapper.CourseMapper;
import edu.nwafu.testpapersystem.domain.entity.Course;
import edu.nwafu.testpapersystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends BaseServiceImpl<Course,Integer> implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public BaseMapper<Course, Integer> getBaseMapper() {
        return courseMapper;
    }
}
