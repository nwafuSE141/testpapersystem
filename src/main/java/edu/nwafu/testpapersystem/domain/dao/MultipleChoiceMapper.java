package edu.nwafu.testpapersystem.domain.dao;

import edu.nwafu.testpapersystem.domain.entity.MultipleChoice;
import java.util.List;

public interface MultipleChoiceMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(MultipleChoice record);

    
    MultipleChoice selectByPrimaryKey(Integer id);

    
    List<MultipleChoice> selectAll();

    
    int updateByPrimaryKey(MultipleChoice record);
}