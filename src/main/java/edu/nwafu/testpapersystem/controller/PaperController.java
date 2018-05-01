package edu.nwafu.testpapersystem.controller;

import edu.nwafu.testpapersystem.domain.entity.PageBean;
import edu.nwafu.testpapersystem.domain.entity.Paper;
import edu.nwafu.testpapersystem.service.PaperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author TinChiWay
 * @data 2018/5/1
 */

@RestController()
@RequestMapping(value = "/paper")
public class PaperController {
    protected static final Logger logger = LoggerFactory.getLogger(PaperController.class);

    @Autowired
    PaperService paperService;

    @PostMapping("/listAll")
    public PageBean listAllPaper(int currentPage, int pageSize){

        PageBean pageData = paperService.listAllPaper(currentPage, pageSize);

        return pageData;
    }

    @PostMapping("/getById")
    public Paper getPaperById(Integer id){
        logger.info("get paper with id : " + id);
        Paper paper = paperService.selectByPrimaryKey(id);
        return paper;
    }

    @PostMapping("/update")
    public int updatePaper(Paper paper){
        logger.info("updata paper with :" + paper);
        return paperService.updateByPrimaryKey(paper);
    }

    @PostMapping("/delete")
    public int deletePaperById(Integer id){
        return paperService.deleteByPrimaryKey(id);
    }
}
