package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.KnowledgePoint;
import java.util.List;

public interface KnowledgePointMapper extends BaseMapper<KnowledgePoint,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(KnowledgePoint record);

    
    KnowledgePoint selectByPrimaryKey(Integer id);

    
    List<KnowledgePoint> selectAll();

    
    int updateByPrimaryKey(KnowledgePoint record);
}