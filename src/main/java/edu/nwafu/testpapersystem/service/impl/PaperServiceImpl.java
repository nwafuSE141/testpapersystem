package edu.nwafu.testpapersystem.service.impl;

import com.github.pagehelper.PageHelper;
import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.entity.PageBean;
import edu.nwafu.testpapersystem.domain.entity.Paper;
import edu.nwafu.testpapersystem.domain.mapper.PaperMapper;
import edu.nwafu.testpapersystem.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl extends BaseServiceImpl<Paper,Integer> implements PaperService {

    @Autowired
    private PaperMapper paperMapper;

    @Override
    public BaseMapper<Paper, Integer> getBaseMapper() {
        return paperMapper;
    }

    @Override
    public PageBean<Paper> listAllPaper(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List result = paperMapper.selectAll();
        return new PageBean<Paper>(result);
    }

}
