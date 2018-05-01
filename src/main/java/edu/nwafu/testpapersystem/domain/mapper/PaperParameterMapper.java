package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.PaperParameter;
import java.util.List;

public interface PaperParameterMapper extends BaseMapper<PaperParameter,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(PaperParameter record);

    
    PaperParameter selectByPrimaryKey(Integer id);

    
    List<PaperParameter> selectAll();

    
    int updateByPrimaryKey(PaperParameter record);
}