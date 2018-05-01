package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.Paper;
import java.util.List;

public interface PaperMapper extends BaseMapper<Paper,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(Paper record);

    
    Paper selectByPrimaryKey(Integer id);

    
    List<Paper> selectAll();

    
    int updateByPrimaryKey(Paper record);
}