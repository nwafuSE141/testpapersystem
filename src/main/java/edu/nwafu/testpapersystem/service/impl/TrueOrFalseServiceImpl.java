package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.entity.TrueOrFalse;
import edu.nwafu.testpapersystem.domain.mapper.TrueOrFalseMapper;
import edu.nwafu.testpapersystem.service.TrueOrFalseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrueOrFalseServiceImpl extends BaseServiceImpl<TrueOrFalse,Integer> implements TrueOrFalseService {

    @Autowired
    private TrueOrFalseMapper trueOrFalseMapper;

    @Override
    public BaseMapper<TrueOrFalse, Integer> getBaseMapper() {
        return trueOrFalseMapper;
    }
}
