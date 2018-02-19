package edu.nwafu.testpapersystem.domain.dao;

import edu.nwafu.testpapersystem.domain.entity.Course;
import java.util.List;

public interface CourseMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(Course record);

    
    Course selectByPrimaryKey(Integer id);

    
    List<Course> selectAll();

    
    int updateByPrimaryKey(Course record);
}