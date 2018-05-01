package edu.nwafu.testpapersystem.controller;

import edu.nwafu.testpapersystem.domain.entity.PageBean;
import edu.nwafu.testpapersystem.domain.entity.PaperInfo;
import edu.nwafu.testpapersystem.service.PaperInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TinChiWay
 * @data 2018/5/1
 */
@RestController
@RequestMapping("/paperInfo")
public class PaperInfoController {

    @Autowired
    private PaperInfoService paperInfoService;

    @PostMapping("/listAll")
    public PageBean listAllPaperInfo(int currentPage, int pageSize){
        PageBean pageData = paperInfoService.listAllPaperInfo(currentPage, pageSize);
        return pageData;
    }

    @PostMapping("/getById")
    public PaperInfo getPaperInfoById(Integer id){
        PaperInfo paperInfo = paperInfoService.selectByPrimaryKey(id);
        return paperInfo;
    }
}
