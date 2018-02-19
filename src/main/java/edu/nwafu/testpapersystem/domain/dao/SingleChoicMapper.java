package edu.nwafu.testpapersystem.domain.dao;

import edu.nwafu.testpapersystem.domain.entity.SingleChoic;
import java.util.List;

public interface SingleChoicMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(SingleChoic record);

    
    SingleChoic selectByPrimaryKey(Integer id);

    
    List<SingleChoic> selectAll();

    
    int updateByPrimaryKey(SingleChoic record);
}