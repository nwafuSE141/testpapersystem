package edu.nwafu.testpapersystem.domain.dao;

import edu.nwafu.testpapersystem.domain.entity.PaperParameter;
import java.util.List;

public interface PaperParameterMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(PaperParameter record);

    
    PaperParameter selectByPrimaryKey(Integer id);

    
    List<PaperParameter> selectAll();

    
    int updateByPrimaryKey(PaperParameter record);
}