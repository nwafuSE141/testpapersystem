package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.entity.MultipleChoice;
import edu.nwafu.testpapersystem.domain.mapper.MultipleChoiceMapper;
import edu.nwafu.testpapersystem.service.MultipleChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultipleChoiceServiceImpl extends BaseServiceImpl<MultipleChoice,Integer> implements MultipleChoiceService {

    @Autowired
    private MultipleChoiceMapper multipleChoiceMapper;

    @Override
    public BaseMapper<MultipleChoice, Integer> getBaseMapper() {
        return multipleChoiceMapper;
    }
}
