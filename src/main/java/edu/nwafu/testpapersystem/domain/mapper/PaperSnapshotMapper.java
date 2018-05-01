package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.PaperSnapshot;
import java.util.List;

public interface PaperSnapshotMapper extends BaseMapper<PaperSnapshot,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(PaperSnapshot record);

    
    PaperSnapshot selectByPrimaryKey(Integer id);

    
    List<PaperSnapshot> selectAll();

    
    int updateByPrimaryKey(PaperSnapshot record);
}