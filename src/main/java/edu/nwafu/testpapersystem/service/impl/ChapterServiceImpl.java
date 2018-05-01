package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.mapper.ChapterMapper;
import edu.nwafu.testpapersystem.domain.entity.Chapter;
import edu.nwafu.testpapersystem.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChapterServiceImpl extends BaseServiceImpl<Chapter,Integer> implements ChapterService {

    @Autowired
    private ChapterMapper chapterMapper;

    @Override
    public BaseMapper<Chapter, Integer> getBaseMapper() {
        return chapterMapper;
    }
}
