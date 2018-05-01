package edu.nwafu.testpapersystem.service.impl;

import com.github.pagehelper.PageHelper;
import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.entity.PageBean;
import edu.nwafu.testpapersystem.domain.entity.PaperInfo;
import edu.nwafu.testpapersystem.domain.mapper.PaperInfoMapper;
import edu.nwafu.testpapersystem.service.PaperInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperInfoServiceImpl extends BaseServiceImpl<PaperInfo,Integer> implements PaperInfoService {

    @Autowired
    private PaperInfoMapper paperInfoMapper;

    @Override
    public BaseMapper<PaperInfo, Integer> getBaseMapper() {
        return paperInfoMapper;
    }

    @Override
    public PageBean listAllPaperInfo(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List list = paperInfoMapper.selectAll();
        return new PageBean(list);
    }
}
