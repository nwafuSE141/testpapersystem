package edu.nwafu.testpapersystem.domain.dao;

import edu.nwafu.testpapersystem.domain.entity.Paper;
import java.util.List;

public interface PaperMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(Paper record);

    
    Paper selectByPrimaryKey(Integer id);

    
    List<Paper> selectAll();

    
    int updateByPrimaryKey(Paper record);
}