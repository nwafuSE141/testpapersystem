package edu.nwafu.testpapersystem.domain.dao;

import edu.nwafu.testpapersystem.domain.entity.Chapter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ChapterMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(Chapter record);

    
    Chapter selectByPrimaryKey(Integer id);

    
    List<Chapter> selectAll();

    
    int updateByPrimaryKey(Chapter record);
}