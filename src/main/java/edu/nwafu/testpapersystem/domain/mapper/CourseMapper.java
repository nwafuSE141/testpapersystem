package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.Course;
import java.util.List;

public interface CourseMapper extends BaseMapper<Course,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(Course record);

    
    Course selectByPrimaryKey(Integer id);

    
    List<Course> selectAll();

    
    int updateByPrimaryKey(Course record);
}