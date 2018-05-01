package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.FillBlank;

import java.util.List;

public interface FillBlankMapper extends BaseMapper<FillBlank,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(FillBlank record);

    
    FillBlank selectByPrimaryKey(Integer id);

    
    List<FillBlank> selectAll();

    
    int updateByPrimaryKey(FillBlank record);
}