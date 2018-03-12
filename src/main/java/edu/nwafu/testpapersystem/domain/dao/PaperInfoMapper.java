package edu.nwafu.testpapersystem.domain.dao;

import edu.nwafu.testpapersystem.domain.entity.PaperInfo;
import java.util.List;

public interface PaperInfoMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(PaperInfo record);

    
    PaperInfo selectByPrimaryKey(Integer id);

    
    List<PaperInfo> selectAll();

    
    int updateByPrimaryKey(PaperInfo record);
}