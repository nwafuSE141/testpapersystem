package edu.nwafu.testpapersystem.domain.dao;

import edu.nwafu.testpapersystem.domain.entity.QuestionType;
import java.util.List;

public interface QuestionTypeMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(QuestionType record);

    
    QuestionType selectByPrimaryKey(Integer id);

    
    List<QuestionType> selectAll();

    
    int updateByPrimaryKey(QuestionType record);
}