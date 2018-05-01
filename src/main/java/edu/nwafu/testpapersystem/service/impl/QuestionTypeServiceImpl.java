package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.entity.QuestionType;
import edu.nwafu.testpapersystem.domain.mapper.QuestionTypeMapper;
import edu.nwafu.testpapersystem.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionTypeServiceImpl extends BaseServiceImpl<QuestionType,Integer> implements QuestionTypeService {

    @Autowired
    private QuestionTypeMapper questionTypeMapper;

    @Override
    public BaseMapper<QuestionType, Integer> getBaseMapper() {
        return questionTypeMapper;
    }
}
