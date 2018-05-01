package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.TrueOrFalse;
import java.util.List;

public interface TrueOrFalseMapper extends BaseMapper<TrueOrFalse,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(TrueOrFalse record);

    
    TrueOrFalse selectByPrimaryKey(Integer id);

    
    List<TrueOrFalse> selectAll();

    
    int updateByPrimaryKey(TrueOrFalse record);
}