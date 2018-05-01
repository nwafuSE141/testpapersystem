package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.Chapter;

import java.util.List;

public interface ChapterMapper extends BaseMapper<Chapter,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(Chapter record);

    
    Chapter selectByPrimaryKey(Integer id);


    List<Chapter> selectAll();

    
    int updateByPrimaryKey(Chapter record);
}