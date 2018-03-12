package edu.nwafu.testpapersystem.domain.dao;

import edu.nwafu.testpapersystem.domain.entity.TrueOrFalse;
import java.util.List;

public interface TrueOrFalseMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(TrueOrFalse record);

    
    TrueOrFalse selectByPrimaryKey(Integer id);

    
    List<TrueOrFalse> selectAll();

    
    int updateByPrimaryKey(TrueOrFalse record);
}