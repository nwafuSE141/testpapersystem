package edu.nwafu.testpapersystem.controller;

import com.alibaba.fastjson.JSON;
import edu.nwafu.testpapersystem.domain.entity.PageBean;
import edu.nwafu.testpapersystem.domain.entity.Paper;
import edu.nwafu.testpapersystem.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author TinChiWay
 * @data 2018/5/1
 */

@RestController()
@RequestMapping(value = "/paper")
public class PaperController {

    @Autowired
    PaperService paperService;

    @PostMapping("/listAll")
    public PageBean listAllPaper(int currentPage, int pageSize){

        PageBean pageData = paperService.listAllPaper(currentPage, pageSize);

        return pageData;
    }

    @PostMapping("/getById")
    public Paper getPaperById(Integer id){
        Paper paper = paperService.selectByPrimaryKey(id);
        return paper;
    }

    @PostMapping("/update")
    public int updatePaper(Paper paper){
        return paperService.updateByPrimaryKey(paper);
    }

    @PostMapping("/delete")
    public int deletePaperById(Integer id){
        return paperService.deleteByPrimaryKey(id);
    }
}
