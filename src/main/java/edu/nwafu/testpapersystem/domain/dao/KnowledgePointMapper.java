package edu.nwafu.testpapersystem.domain.dao;

import edu.nwafu.testpapersystem.domain.entity.KnowledgePoint;
import java.util.List;

public interface KnowledgePointMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(KnowledgePoint record);

    
    KnowledgePoint selectByPrimaryKey(Integer id);

    
    List<KnowledgePoint> selectAll();

    
    int updateByPrimaryKey(KnowledgePoint record);
}