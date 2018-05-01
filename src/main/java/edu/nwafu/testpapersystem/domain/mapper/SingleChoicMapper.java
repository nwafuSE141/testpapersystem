package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.SingleChoic;
import java.util.List;

public interface SingleChoicMapper extends BaseMapper<SingleChoic,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(SingleChoic record);

    
    SingleChoic selectByPrimaryKey(Integer id);

    
    List<SingleChoic> selectAll();

    
    int updateByPrimaryKey(SingleChoic record);
}