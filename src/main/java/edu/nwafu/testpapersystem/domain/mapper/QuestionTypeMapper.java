package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.QuestionType;
import java.util.List;

public interface QuestionTypeMapper extends BaseMapper<QuestionType,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(QuestionType record);

    
    QuestionType selectByPrimaryKey(Integer id);

    
    List<QuestionType> selectAll();

    
    int updateByPrimaryKey(QuestionType record);
}