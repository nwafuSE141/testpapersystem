package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.mapper.KnowledgePointMapper;
import edu.nwafu.testpapersystem.domain.entity.KnowledgePoint;
import edu.nwafu.testpapersystem.service.KnowledgePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KnowledgePointServiceImpl extends BaseServiceImpl<KnowledgePoint,Integer> implements KnowledgePointService {

    @Autowired
    private KnowledgePointMapper knowledgePointMapper;

    @Override
    public BaseMapper<KnowledgePoint, Integer> getBaseMapper() {
        return knowledgePointMapper;
    }
}
