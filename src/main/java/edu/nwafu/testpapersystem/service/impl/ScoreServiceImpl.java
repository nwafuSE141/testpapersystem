package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.Vo.*;
import edu.nwafu.testpapersystem.domain.entity.Score;
import edu.nwafu.testpapersystem.domain.mapper.ScoreMapper;
import edu.nwafu.testpapersystem.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ScoreServiceImpl extends BaseServiceImpl<Score,Integer> implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public BaseMapper<Score, Integer> getBaseMapper() {
        return scoreMapper;
    }

    @Override
    public List<ScoreVo> findScoreByPname(String pname) {
        return scoreMapper.findScoreByPname(pname);
    }



    @Override
    public Double findAvgTestTime(String pname) {
        return scoreMapper.findAvgTestTime(pname);
    }

    @Override
    public List<AroundVo> findAround(String pname, String classname) {
        return scoreMapper.findAround(pname,classname);
    }

    @Override
    public MaxAndMinVo findMaxAndMin(String classname, String pname) {
        return scoreMapper.findMaxAndMin(classname,pname);
    }

    @Override
    public List<Double> findSumList(String classname, String pname) {
        return scoreMapper.findSumList(classname,pname);
    }

    @Override
    public List<String> findAllScore(String pname) {
        return scoreMapper.findAllScore(pname);
    }

   /* @Override
    public List<Integer> findTypeNumber(String pname) {
        return scoreMapper.findTypeNumber(pname);
    }

    @Override
    public List<AllAndHadVo> findAllAndHad(String testNumber, String pname) {
        return scoreMapper.findAllAndHad(testNumber,pname);
    }*/

    @Override
    public int findQuestionCount(String pname,String stuid) {
        return scoreMapper.findQuestionCount(pname,stuid);
    }

    @Override
    public int findKonwledgeCount(String pname) {
        return scoreMapper.findKonwledgeCount(pname);
    }

    @Override
    public int findTypeCount(String pname) {
        return scoreMapper.findTypeCount(pname);
    }

    @Override
    public List<PointNameAndHadVo> findPointNameAndHad(String pname, String stuid) {
        return scoreMapper.findPointNameAndHad(pname,stuid);
    }

    @Override
    public List<String> findClassName() {
        return scoreMapper.findClassName();
    }

    @Override
    public List<AroundVo> findAround2(String pname, String classname) {
        return scoreMapper.findAround2(pname,classname);
    }

    @Override
    public List<String> findStudentByPname(String pname) {
        return scoreMapper.findStudentByPname(pname);
    }

    @Override
    public List<AllAndAvgVo> findAllAndAvgScore(String pname, String stuid) {
        return scoreMapper.findAllAndAvgScore(pname,stuid);
    }

    @Override
    public List<TestNumberAndQuesId> findTypeNumAndQuesId(String pname) {
        return scoreMapper.findTypeNumAndQuesId(pname);
    }

    @Override
    public Double findAvg(Map map) {
        return scoreMapper.findAvg(map);
    }

    @Override
    public Integer findQuestionScore(String pname, String test_number, String question_id) {
        return scoreMapper.findQuestionScore(pname,test_number,question_id);
    }

    @Override
    public Double findQuestionAvgScore(String pname, String test_number, String question_id) {
        return scoreMapper.findQuestionAvgScore(pname,test_number,question_id);
    }


}
