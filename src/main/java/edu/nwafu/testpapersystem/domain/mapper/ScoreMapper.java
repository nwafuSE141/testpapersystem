package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.Vo.*;
import edu.nwafu.testpapersystem.domain.entity.Score;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface ScoreMapper extends BaseMapper<Score,Integer> {

    @Select("SELECT distinct ptype, question_score FROM score where pname=#{pname}")
    List<ScoreVo> findScoreByPname(String pname);

   /* @Select("SELECT sum(had_score) allscore,avg(had_score) avgscore  FROM score where pname=#{pname}  group by  pname")
    List<AllAndAvgVo> findAllAndAvgScore(String pname);*/
//SELECT distinct knowledge_pointid ,knowledge_pointname  FROM test_paper_system.score ;

    @Select("SELECT distinct stuid FROM test_paper_system.score where pname=#{pname};")
    List<String> findStudentByPname(String pname);

    @Select("SELECT knowledge_pointname pointname, sum(question_score) allscore,avg(had_score) avgscore FROM test_paper_system.score where pname=#{pname} and stuid=#{stuid} group by knowledge_pointname")
    List<AllAndAvgVo> findAllAndAvgScore(@Param("pname") String pname, @Param("stuid") String stuid);





    @Select("SELECT avg(test_time)  FROM test_paper_system.score where pname=#{pname}  group by  pname;")
    Double findAvgTestTime(String pname);

    @Select("select a.ranges around,count(*) times  from (SELECT if( sum(had_score)<60,'0~59', if( sum(had_score) between 60 and 70,'60~70',if( sum(had_score) between 70 and 80,'70~80',if( sum(had_score) between 80 and 90,'80~90','90~100')))) as ranges FROM test_paper_system.score where pname=#{pname} and classname=#{classname}  group by stuid) a  group by a.ranges")
    List<AroundVo> findAround(@Param("pname") String pname, @Param("classname") String classname);


    @Select("select a.ranges around,count(*) times  from (SELECT if( sum(had_score)<50,'0~49', if( sum(had_score) between 50 and 60,'50~59',if( sum(had_score) between 60 and 80,'60~79',if( sum(had_score) between 80 and 90,'80~89','90~100')))) as ranges FROM test_paper_system.score where pname=#{pname} and classname=#{classname}  group by stuid) a  group by a.ranges")
    List<AroundVo> findAround2(@Param("pname") String pname, @Param("classname") String classname);

    @Select("select  max(a.sums) maxScore,min(a.sums) minScore,avg(a.sums) avgScore ,count(*)  countPerson from (SELECT sum(had_score) sums FROM test_paper_system.score where classname=#{classname} and  pname=#{pname} group by stuid) a ")
    MaxAndMinVo findMaxAndMin(@Param("classname") String classname, @Param("pname") String pname);


    @Select("SELECT sum(had_score) sumScore FROM score where classname=#{classname} and pname=#{pname} group by stuid")
    List<Double>  findSumList(@Param("classname") String classname, @Param("pname") String pname);


    //题量
    @Select("SELECT count(*) FROM score where pname=#{pname} and stuid=#{stuid} group by pname ")
    int findQuestionCount(@Param("pname") String pname, @Param("stuid") String stuid);


    //知识点量
    @Select("select count(*) from( SELECT distinct knowledge_pointid from score where pname=#{pname} ) a ")
    int findKonwledgeCount(String pname);

    //试题类型总数
    @Select("select count(*) from( SELECT distinct ptype from score where pname=#{pname} ) a ")
    int findTypeCount(String pname);


    @Select("SELECT stuid  from score where pname=#{pname}  group by stuid order by sum(had_score) desc")
    List<String> findAllScore(String pname);

/*
    //每个试卷的试题种类
    @Select("SELECT distinct test_number FROM score  where pname=#{pname}")
    List<Integer> findTypeNumber(String pname);


    //每一个test_number的总分和已得分
    @Select("SELECT  sum(question_score) allSum,sum(had_score) hadSum  FROM score   where test_number=#{testNumber} and pname=#{pname}   group by stuid")
    List<AllAndHadVo> findAllAndHad(@Param("testNumber") String testNumber,@Param("pname") String pname);*/
    @Select("SELECT distinct test_number testNumber,question_id questionId FROM score where pname=#{pname}")
    List<TestNumberAndQuesId> findTypeNumAndQuesId(String pname);


    Double findAvg(Map map);


    //分值分布
    @Select("SELECT knowledge_pointname pointName,sum(question_score) hadScore FROM score where pname=#{pname} and  stuid=#{stuid} group by knowledge_pointname")
    List<PointNameAndHadVo> findPointNameAndHad(@Param("pname") String pname, @Param("stuid") String stuid);

    @Select("SELECT distinct classname FROM score")
    List<String> findClassName();


    @Select("SELECT distinct  question_score  FROM test_paper_system.score where  pname=#{pname} and test_number=#{test_number} and question_id=#{question_id} ")
    Integer findQuestionScore(@Param("pname") String pname, @Param("test_number") String test_number, @Param("question_id") String question_id);

    @Select("SELECT  avg(had_score)  FROM test_paper_system.score where  pname=#{pname} and test_number=#{test_number} and question_id=#{question_id} ")
    Double findQuestionAvgScore(@Param("pname") String pname, @Param("test_number") String test_number, @Param("question_id") String question_id);


}