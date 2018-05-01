package edu.nwafu.testpapersystem.service;


import edu.nwafu.testpapersystem.Base.BaseService;
import edu.nwafu.testpapersystem.domain.entity.Paper;

import java.util.List;

public interface PaperService extends BaseService<Paper,Integer> {
    public List<Paper> listAllPaper();
}
