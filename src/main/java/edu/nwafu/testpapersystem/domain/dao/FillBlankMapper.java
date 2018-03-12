package edu.nwafu.testpapersystem.domain.dao;

import edu.nwafu.testpapersystem.domain.entity.FillBlank;
import java.util.List;

public interface FillBlankMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(FillBlank record);

    
    FillBlank selectByPrimaryKey(Integer id);

    
    List<FillBlank> selectAll();

    
    int updateByPrimaryKey(FillBlank record);
}