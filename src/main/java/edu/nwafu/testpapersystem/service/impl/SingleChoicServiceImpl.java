package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.entity.SingleChoic;
import edu.nwafu.testpapersystem.domain.mapper.SingleChoicMapper;
import edu.nwafu.testpapersystem.service.SingleChoicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SingleChoicServiceImpl extends BaseServiceImpl<SingleChoic,Integer> implements SingleChoicService {

    @Autowired
    private SingleChoicMapper singleChoicMapper;

    @Override
    public BaseMapper<SingleChoic, Integer> getBaseMapper() {
        return singleChoicMapper;
    }
}
