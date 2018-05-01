package edu.nwafu.testpapersystem.service;


import edu.nwafu.testpapersystem.Base.BaseService;
import edu.nwafu.testpapersystem.domain.entity.PageBean;
import edu.nwafu.testpapersystem.domain.entity.PaperInfo;

public interface PaperInfoService extends BaseService<PaperInfo,Integer> {

    PageBean listAllPaperInfo(int currentPage, int pageSize);
}
