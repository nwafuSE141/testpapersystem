package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.PaperInfo;
import java.util.List;

public interface PaperInfoMapper extends BaseMapper<PaperInfo,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(PaperInfo record);

    
    PaperInfo selectByPrimaryKey(Integer id);

    
    List<PaperInfo> selectAll();

    
    int updateByPrimaryKey(PaperInfo record);
}