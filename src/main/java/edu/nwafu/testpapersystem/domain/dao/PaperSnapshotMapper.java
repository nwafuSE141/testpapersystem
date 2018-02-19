package edu.nwafu.testpapersystem.domain.dao;

import edu.nwafu.testpapersystem.domain.entity.PaperSnapshot;
import java.util.List;

public interface PaperSnapshotMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(PaperSnapshot record);

    
    PaperSnapshot selectByPrimaryKey(Integer id);

    
    List<PaperSnapshot> selectAll();

    
    int updateByPrimaryKey(PaperSnapshot record);
}