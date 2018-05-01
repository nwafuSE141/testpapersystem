package edu.nwafu.testpapersystem.service;

import edu.nwafu.testpapersystem.Base.BaseService;
import edu.nwafu.testpapersystem.domain.Vo.*;
import edu.nwafu.testpapersystem.domain.entity.Score;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ScoreService extends BaseService<Score,Integer> {
    List<ScoreVo> findScoreByPname(String pname);


    Double findAvgTestTime(String pname);

    List<AroundVo> findAround(String pname, String classname);

    MaxAndMinVo findMaxAndMin(String classname, String pname);

    List<Double>  findSumList(String classname, String pname);

    List<String> findAllScore(String pname);

   /* List<Integer> findTypeNumber(String pname);

    List<AllAndHadVo> findAllAndHad( String testNumber, String pname);*/

    int findQuestionCount(String pname, String stuid);

    int findKonwledgeCount(String pname);

    int findTypeCount(String pname);

    List<PointNameAndHadVo> findPointNameAndHad(String pname, String stuid);

    List<String> findClassName();

    List<AroundVo> findAround2(@Param("pname") String pname, @Param("classname") String classname);

    List<String> findStudentByPname(String pname);

    List<AllAndAvgVo> findAllAndAvgScore(String pname, String stuid);

    List<TestNumberAndQuesId> findTypeNumAndQuesId(String pname);

    Double findAvg(Map map);

    Integer findQuestionScore(String pname, String test_number, String question_id);

    Double findQuestionAvgScore(String pname, String test_number, String question_id);
}
