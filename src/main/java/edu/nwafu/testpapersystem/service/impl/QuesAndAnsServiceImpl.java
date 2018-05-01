package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.mapper.QuesAndAnsMapper;
import edu.nwafu.testpapersystem.domain.entity.QuesAndAns;
import edu.nwafu.testpapersystem.service.QuesAndAnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuesAndAnsServiceImpl extends BaseServiceImpl<QuesAndAns,Integer> implements QuesAndAnsService {

    @Autowired
    private QuesAndAnsMapper quesAndAnsMapper;

    @Override
    public BaseMapper<QuesAndAns, Integer> getBaseMapper() {
        return quesAndAnsMapper;
    }
}
