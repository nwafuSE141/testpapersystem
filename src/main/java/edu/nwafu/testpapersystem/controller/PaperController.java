package edu.nwafu.testpapersystem.controller;

import com.alibaba.fastjson.JSON;
import edu.nwafu.testpapersystem.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/listAllPaper")
    public String listAllPaper(){

        List paperList = paperService.listAllPaper();

        return JSON.toJSONString(paperList);
    }

}
