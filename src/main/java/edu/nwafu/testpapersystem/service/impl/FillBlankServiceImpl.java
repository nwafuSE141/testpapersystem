package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.mapper.FillBlankMapper;
import edu.nwafu.testpapersystem.domain.entity.FillBlank;
import edu.nwafu.testpapersystem.service.FillBlankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FillBlankServiceImpl extends BaseServiceImpl<FillBlank,Integer> implements FillBlankService {

    @Autowired
    private FillBlankMapper fillBlankMapper;

    @Override
    public BaseMapper<FillBlank, Integer> getBaseMapper() {
        return fillBlankMapper;
    }


}
