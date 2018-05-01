package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.MultipleChoice;
import java.util.List;

public interface MultipleChoiceMapper extends BaseMapper<MultipleChoice,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(MultipleChoice record);

    
    MultipleChoice selectByPrimaryKey(Integer id);

    
    List<MultipleChoice> selectAll();

    
    int updateByPrimaryKey(MultipleChoice record);
}