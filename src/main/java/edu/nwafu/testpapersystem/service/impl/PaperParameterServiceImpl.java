package edu.nwafu.testpapersystem.service.impl;


import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.mapper.PaperParameterMapper;
import edu.nwafu.testpapersystem.domain.entity.PaperParameter;
import edu.nwafu.testpapersystem.service.PaperParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaperParameterServiceImpl extends BaseServiceImpl<PaperParameter,Integer> implements PaperParameterService {

    @Autowired
    private PaperParameterMapper paperParameterMapper;

    @Override
    public BaseMapper<PaperParameter, Integer> getBaseMapper() {
        return paperParameterMapper;
    }
}
