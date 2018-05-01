package edu.nwafu.testpapersystem.controller;

import com.alibaba.fastjson.JSONObject;
import edu.nwafu.testpapersystem.domain.Vo.*;
import edu.nwafu.testpapersystem.domain.entity.User;
import edu.nwafu.testpapersystem.service.ScoreService;
import edu.nwafu.testpapersystem.service.UserService;
import edu.nwafu.testpapersystem.util.JsonHandler;
import edu.nwafu.testpapersystem.util.StandardUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ScoreService scoreService;
    /**
     * 用户登陆
     * @param password
     * @param name
     * @param role_id
     * @return
     */
    @RequestMapping("login")
    public JSONObject login(String password, String name, String role_id, HttpServletRequest request){
        if(StringUtils.isEmpty(password.trim())) {
            return JsonHandler.jsonFail("密码不能为空");
        }
        if(StringUtils.isEmpty(name.trim())) {
            return JsonHandler.jsonFail("用户名不能为空");
        }

        if(StringUtils.isEmpty(role_id.trim())) {
            return JsonHandler.jsonFail("role_id不能为空");
        }

        User user=userService.findByNameAndRoleId(name,Integer.parseInt(role_id));
        if(user==null){
            return  JsonHandler.jsonFail("没有该用户");
        }else {
            if(!user.getPassword().equals(password)){
                return JsonHandler.jsonFail("用户密码输入不正确");
            }
            HttpSession httpSession=request.getSession();
            httpSession.setAttribute("user",user);
            return JsonHandler.jsonSuccess("登陆成功");
        }

    }


    /**
     * 修改用户资料
     * @param user
     * @return
     */
    @RequestMapping("editUser")
    public JSONObject editUser(User user){
        if(user.getId()==null){
            return  JsonHandler.jsonFail("请选择一个用户");
        }

        userService.updateByPrimaryKeySelective(user);
        return JsonHandler.jsonSuccess("用户修改成功");
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping("deleteUser")
    public JSONObject deleteUser(String id){
        if(StringUtils.isEmpty(id)){
            return JsonHandler.jsonFail("请选中一个用户");
        }
        userService.deleteByPrimaryKey(Integer.valueOf(id));
        return  JsonHandler.jsonSuccess("删除用户成功");
    }

    /**
     * 增加用户
     * @param user
     * @return
     */
    @RequestMapping("saveUser")
    public JSONObject saveUser(User user){
        userService.insertSelective(user);
        return JsonHandler.jsonSuccess("增加用户成功");
    }

    /**
     * 查找用户
     * @param id
     * @return
     */
    @RequestMapping("findUser")
    public JSONObject findUser(String id){
        if(StringUtils.isEmpty(id)){
            return  JsonHandler.jsonFail("请选中一个用户");
        }
        User user=userService.selectByPrimaryKey(Integer.valueOf(id));
        JSONObject jsonObject= (JSONObject) JSONObject.toJSON(user);
        return JsonHandler.jsonSuccess(jsonObject);
    }


    /**
     * 根据试卷名称查询每个题型所占分值
     * @param pname
     * @return
     */
    @RequestMapping("findScoreByPname")
    public JSONObject findScoreByPname(String pname){
        if(StringUtils.isEmpty(pname)){
            return  JsonHandler.jsonFail("试卷名不能为空");
        }

        List<ScoreVo> score=scoreService.findScoreByPname(pname);
        if(score.size()==0){
            return JsonHandler.jsonFail("该试卷查询不到题目");
        }
        return  JsonHandler.jsonSuccess(score);
    }

    /**
     * 根据试卷名查询总分和平均分
     * @param pname
     * @return
     */
    @RequestMapping("findAllAndAvgScore")
    public JSONObject findAllAndAvgScore(String pname){
        if(StringUtils.isEmpty(pname)){
            return  JsonHandler.jsonFail("试卷名不能为空");
        }
        List<String> score=scoreService.findStudentByPname(pname);
        if(score.size()==0){
            return JsonHandler.jsonFail("该试卷查询不到结果");
        }
        List<AllAndAvgVo> list=scoreService.findAllAndAvgScore(pname,score.get(0));
        return JsonHandler.jsonSuccess(list);
    }




    /**
     * 根据试卷名查询平均测试时间
     * @param
     * @return
     */
    @RequestMapping("findAvgTestTime")
    public JSONObject findAvgTestTime(String pname){
        if(StringUtils.isEmpty(pname)){
            return  JsonHandler.jsonFail("试卷名不能为空");
        }
        Double avg=scoreService.findAvgTestTime(pname);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("avgTime",avg);
        return JsonHandler.jsonSuccess(jsonObject);
    }


    /**
     * 试卷名和班级名查询每个等级得分人数
     * @param pname
     * @param classname
     * @return
     */
    @RequestMapping("findAround")
    public JSONObject findAround(String pname , String  classname){
        if(StringUtils.isEmpty(pname)){
            return  JsonHandler.jsonFail("试卷名不能为空");
        }
        if(StringUtils.isEmpty(classname)){
            return  JsonHandler.jsonFail("班级名不能为空");
        }
        List<AroundVo> aroundVos=scoreService.findAround(pname,classname);
        if(aroundVos.size()==0){
            return JsonHandler.jsonFail("该试卷查询不到");
        }
        return  JsonHandler.jsonSuccess(aroundVos);
    }

    /**
     * 根据试卷名，班级名查出考试人数、最高分、最低分、平均分、标准差
     * @param pname
     * @param classname
     * @return
     */
    @RequestMapping("findMaxAndMin")
    public JSONObject findMaxAndMin(String pname , String classname){
        if(StringUtils.isEmpty(pname)){
            return  JsonHandler.jsonFail("试卷名不能为空");
        }
        if(StringUtils.isEmpty(classname)){
            return  JsonHandler.jsonFail("班级名不能为空");
        }
        MaxAndMinVo maxAndMin=scoreService.findMaxAndMin(classname,pname);
        if(maxAndMin==null){
            return JsonHandler.jsonFail("没有查询到任何数据");
        }
        List<Double> doubles=scoreService.findSumList(classname,pname);
        Double[] doubles1= (Double[]) doubles.toArray();

        double standard= StandardUtil.StandardDiviation(doubles1);
        maxAndMin.setStandard(standard);
        JSONObject jsonObject= (JSONObject) JSONObject.toJSON(maxAndMin);
        return JsonHandler.jsonSuccess(jsonObject);
    }


    /**
     * 试卷结构
     * @param pname
     * @return
     */
    @RequestMapping("findStructure")
    public JSONObject findStructure(String pname){
        if(StringUtils.isEmpty(pname)){
            return  JsonHandler.jsonFail("试卷名不能为空");
        }
        List<String> allScore=scoreService.findAllScore(pname);
        if(allScore.size()==0){
            return JsonHandler.jsonFail("没有查询到结果");
        }

        List<TestNumberAndQuesId> testNumberAndQuesIds=scoreService.findTypeNumAndQuesId(pname);
        List<String> maxList=allScore.subList(0,allScore.size()*27/100);
        List<String> minList=allScore.subList(allScore.size()-allScore.size()*27/100,allScore.size());
        Double maxdoubles=0.0;
        Double mindoubles=0.0;
        Integer n=0;
        for(TestNumberAndQuesId testNumberAndQuesId:testNumberAndQuesIds) {
            Map map = new HashMap();
            map.put("pname", pname);
            map.put("test_number", testNumberAndQuesId.getTestNumber());
            map.put("question_id", testNumberAndQuesId.getQuestionId());
            map.put("list", maxList);
            maxdoubles = scoreService.findAvg(map);

            Map map1 = new HashMap();
            map.put("pname", pname);
            map.put("test_number", testNumberAndQuesId.getTestNumber());
            map.put("question_id", testNumberAndQuesId.getQuestionId());
            map.put("list", minList);
            mindoubles = scoreService.findAvg(map);

            Integer dou = scoreService.findQuestionScore(pname, testNumberAndQuesId.getTestNumber(), testNumberAndQuesId.getQuestionId());
            Double d = (maxdoubles - mindoubles) / (double) dou;
            if(d>0.2){
                n++;
            }
        }


        Double percent=n/(double)testNumberAndQuesIds.size();

        List<String> list=scoreService.findStudentByPname(pname);
         int questionCount=scoreService.findQuestionCount(pname,list.get(0));
         int knowledge=scoreService.findKonwledgeCount(pname);
         int typeCount=scoreService.findTypeCount(pname);
         JSONObject jsonObject=new JSONObject();
         jsonObject.put("percent",percent);
         jsonObject.put("questionCount",questionCount);
         jsonObject.put("knowledgeCount",knowledge);
         jsonObject.put("typeCount",typeCount);

         return  JsonHandler.jsonSuccess(jsonObject);
    }

    /**
     * 试题区分度
     * @param pname
     * @return
     */
    @RequestMapping("findDiscrimination")
    public JSONObject findDiscrimination(String pname){
        if(StringUtils.isEmpty(pname)){
            return  JsonHandler.jsonFail("试卷名不能为空");
        }
        List<String> allScore=scoreService.findAllScore(pname);
        if(allScore.size()==0){
            return JsonHandler.jsonFail("没有查询到结果");
        }

        List<TestNumberAndQuesId> testNumberAndQuesIds=scoreService.findTypeNumAndQuesId(pname);
        List<Map<String,String>> back=new ArrayList<>();
        List<Map> list1=new ArrayList();
        List<Map> list2=new ArrayList();
        List<Map> list3=new ArrayList();
        List<Map> list4=new ArrayList();
        List<Map> list5=new ArrayList();
        List<String> maxList=allScore.subList(0,allScore.size()*27/100);
        List<String> minList=allScore.subList(allScore.size()-allScore.size()*27/100,allScore.size());
        Double maxdoubles=0.0;
        Double mindoubles=0.0;
        for(TestNumberAndQuesId testNumberAndQuesId:testNumberAndQuesIds){
            Map map=new HashMap();
            map.put("pname",pname);
            map.put("test_number",testNumberAndQuesId.getTestNumber());
            map.put("question_id",testNumberAndQuesId.getQuestionId());
            map.put("list",maxList);
             maxdoubles=  scoreService.findAvg(map);

            Map map1=new HashMap();
            map.put("pname",pname);
            map.put("test_number",testNumberAndQuesId.getTestNumber());
            map.put("question_id",testNumberAndQuesId.getQuestionId());
            map.put("list",minList);
            mindoubles=scoreService.findAvg(map);

            Integer dou=scoreService.findQuestionScore(pname,testNumberAndQuesId.getTestNumber(),testNumberAndQuesId.getQuestionId());
            Double d=(maxdoubles-mindoubles)/(double) dou;
            Map map3=new HashMap();
            map3.put("test_number",""+testNumberAndQuesId.getTestNumber());
            map3.put("question_id",""+testNumberAndQuesId.getQuestionId());
            map3.put("d",d+"");
            back.add(map3);
            if(d<=0.19){
                list1.add(map3);
            }else if(d>=0.2 && d<=0.29){
                list2.add(map3);
            }else if(d>=0.3 && d<=0.39){
                list3.add(map3);
            }else if(d>=0.4){
                list4.add(map3);
            }else{
                list5.add(map3);
            }
        }
        Integer sum1=0;
        Integer sum2=0;
        Integer sum3=0;
        Integer sum4=0;
        Integer sum5=0;
        for(Map map:list1){
           sum1+=scoreService.findQuestionScore(pname,(String) map.get("test_number"),(String) map.get("question_id"));
        }
        for(Map map:list2){
            sum2+=scoreService.findQuestionScore(pname,(String) map.get("test_number"),(String) map.get("question_id"));
        }
        for(Map map:list3){
            sum3+=scoreService.findQuestionScore(pname,(String) map.get("test_number"),(String) map.get("question_id"));
        }
        for(Map map:list4){
            sum4+=scoreService.findQuestionScore(pname,(String) map.get("test_number"),(String) map.get("question_id"));
        }
        for(Map map:list5){
            sum5+=scoreService.findQuestionScore(pname,(String) map.get("test_number"),(String) map.get("question_id"));
        }

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("list",back);
        jsonObject.put("dpercent",getDPercent(sum1,sum2,sum3,sum4,sum5,100));
    return JsonHandler.jsonSuccess(jsonObject);

    }

    /**
     * 分值分布
     * @param pname
     * @return
     */
    @RequestMapping("findScoreDist")
    public JSONObject findScoreDist(String pname){
        if(StringUtils.isEmpty(pname)){
            return  JsonHandler.jsonFail("试卷名不能为空");
        }
        List<String> lists=scoreService.findStudentByPname(pname);
        List<PointNameAndHadVo> list=scoreService.findPointNameAndHad(pname,lists.get(0));
        return JsonHandler.jsonSuccess(list);

    }


    /**
     * 考试成绩正态分布偏差率
     * @return
     */
    @RequestMapping("findT")
    public JSONObject findT(String pname){
        if(StringUtils.isEmpty(pname)){
            return  JsonHandler.jsonFail("试卷名不能为空");
        }
        List<String> classnames=scoreService.findClassName();
        List<Map<String,String>> back=new ArrayList<>();
        for(String classname : classnames){
            List<AroundVo> list=scoreService.findAround2(pname,classname);
            Integer N1=0;
            Integer N2=0;
            Integer N3=0;
            Integer N4=0;
            Integer N5=0;
            for(AroundVo aroundVo:list){
                if(aroundVo.getAround().equals("0~49")){
                    N1=Integer.parseInt(aroundVo.getTimes())+ N1;
                }else if(aroundVo.getAround().equals("50~59")){
                    N2=Integer.parseInt(aroundVo.getTimes())+ N2;
                }else if(aroundVo.getAround().equals("60~79")){
                    N3=Integer.parseInt(aroundVo.getTimes())+ N3;
                }else if(aroundVo.getAround().equals("80~89")){
                    N4=Integer.parseInt(aroundVo.getTimes())+ N4;
                }else if(aroundVo.getAround().equals("90~100")){
                    N5=Integer.parseInt(aroundVo.getTimes())+ N5;
                }
            }
            Map map=new HashMap();
           map.put( classname,getT(N1,N2,N3,N4,N5)+"");
           back.add(map);
        }
    return JsonHandler.jsonSuccess(back);
    }


    /**
     * 试题难度等级
     * @return
     */
    @RequestMapping("findHard")
    public JSONObject findHard(String pname){
        if(StringUtils.isEmpty(pname)){
            return  JsonHandler.jsonFail("试卷名不能为空");
        }
        Integer sum1=0;
        Integer sum2=0;
        Integer sum3=0;
        Integer sum4=0;
        Integer sum5=0;
        List<TestNumberAndQuesId> testNumberAndQuesIds= scoreService.findTypeNumAndQuesId(pname);
        for(TestNumberAndQuesId testNumberAndQuesId:testNumberAndQuesIds){
           Double a=scoreService.findQuestionAvgScore(pname,testNumberAndQuesId.getTestNumber(),testNumberAndQuesId.getQuestionId());
           Integer b=scoreService.findQuestionScore(pname,testNumberAndQuesId.getTestNumber(),testNumberAndQuesId.getQuestionId());
           double result=a/b;
           if(result<=0.19){
               sum1++;
           }else if (result>=0.2 && result<=0.39){
               sum2++;
           }else if(result>=0.4 && result<=0.59){
               sum3++;
           }else if(result>=0.6 && result<=0.79){
               sum4++;
           }else{
               sum5++;
           }

        }
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("0~0.19",sum1);
        jsonObject.put("0.2~0.39",sum2);
        jsonObject.put("0.4~0.59",sum3);
        jsonObject.put("0.6~0.79",sum4);
        jsonObject.put("0.8~1.0",sum5);

        return JsonHandler.jsonSuccess(jsonObject);
    }

    /**
     *试卷难度分布率
     * @return
     */
    @RequestMapping("findHardPercent")
    public JSONObject findHardPercent(String pname){

        List<TestNumberAndQuesId> testNumberAndQuesIds= scoreService.findTypeNumAndQuesId(pname);
        List<Map> list1=new ArrayList();
        List<Map> list2=new ArrayList();
        List<Map> list3=new ArrayList();
        List<Map> list4=new ArrayList();
        List<Map> list5=new ArrayList();
        for(TestNumberAndQuesId testNumberAndQuesId:testNumberAndQuesIds){
            Double a=scoreService.findQuestionAvgScore(pname,testNumberAndQuesId.getTestNumber(),testNumberAndQuesId.getQuestionId());
            Integer b=scoreService.findQuestionScore(pname,testNumberAndQuesId.getTestNumber(),testNumberAndQuesId.getQuestionId());
            double result=a/b;
            if(result<=0.19){
                Map map=new HashMap();
                map.put("test_number",testNumberAndQuesId.getTestNumber());
                map.put("question_id",testNumberAndQuesId.getQuestionId());
                list1.add(map);
            }else if (result>=0.2 && result<=0.39){
                Map map=new HashMap();
                map.put("test_number",testNumberAndQuesId.getTestNumber());
                map.put("question_id",testNumberAndQuesId.getQuestionId());
                list2.add(map);
            }else if(result>=0.4 && result<=0.59){
                Map map=new HashMap();
                map.put("test_number",testNumberAndQuesId.getTestNumber());
                map.put("question_id",testNumberAndQuesId.getQuestionId());
                list3.add(map);
            }else if(result>=0.6 && result<=0.79){
                Map map=new HashMap();
                map.put("test_number",testNumberAndQuesId.getTestNumber());
                map.put("question_id",testNumberAndQuesId.getQuestionId());
                list4.add(map);
            }else{
                Map map=new HashMap();
                map.put("test_number",testNumberAndQuesId.getTestNumber());
                map.put("question_id",testNumberAndQuesId.getQuestionId());
                list5.add(map);
            }
        }

        Integer sum1=0;
        Integer sum2=0;
        Integer sum3=0;
        Integer sum4=0;
        Integer sum5=0;
        for(Map map:list1){
          sum1+= scoreService.findQuestionScore(pname,(String) map.get("test_number"),(String) map.get("question_id"));
        }
        for(Map map:list2){
            sum2+= scoreService.findQuestionScore(pname,(String) map.get("test_number"),(String) map.get("question_id"));
        }
        for(Map map:list3){
            sum3+= scoreService.findQuestionScore(pname,(String) map.get("test_number"),(String) map.get("question_id"));
        }
        for(Map map:list4){
            sum4+= scoreService.findQuestionScore(pname,(String) map.get("test_number"),(String) map.get("question_id"));
        }
        for(Map map:list5){
            sum5+= scoreService.findQuestionScore(pname,(String) map.get("test_number"),(String) map.get("question_id"));
        }

          return  JsonHandler.jsonSuccess(getHard(sum1,sum2,sum3,sum4,sum5,100)+"");
    }

    @RequestMapping("findReliability")
    public JSONObject findReliability(String pname){
        if(StringUtils.isEmpty(pname)){
            return  JsonHandler.jsonFail("试卷名不能为空");
        }
        List<TestNumberAndQuesId> oddNumber =new ArrayList<>();
        List<TestNumberAndQuesId> evenNumber =new ArrayList<>();
       List<TestNumberAndQuesId> testNumberAndQuesIds=scoreService.findTypeNumAndQuesId(pname);
        for(TestNumberAndQuesId testNumberAndQuesId:testNumberAndQuesIds){
           Integer a= Integer.parseInt(testNumberAndQuesId.getTestNumber()+testNumberAndQuesId.getQuestionId());
            if(a%2==0){
                evenNumber.add(testNumberAndQuesId);
            }else{
                oddNumber.add(testNumberAndQuesId);
            }
        }
        Integer x1=0;  //奇数和
        Integer x2=0;  //偶数和

        for(TestNumberAndQuesId testNumberAndQuesId:oddNumber){
            x1+=scoreService.findQuestionScore(pname,testNumberAndQuesId.getTestNumber(),testNumberAndQuesId.getQuestionId());
        }

        for(TestNumberAndQuesId testNumberAndQuesId:evenNumber){
            x2+=scoreService.findQuestionScore(pname,testNumberAndQuesId.getTestNumber(),testNumberAndQuesId.getQuestionId());
        }

        /*把x1 和x2传入封装方法*/

        return null;
    }




    public static Double getT(Integer N1,Integer N2,Integer N3,Integer N4,Integer N5){
        Integer N=N1+N2+N3+N4+N5;
        if(N==0){
            return 0.0;
        }
        Double n1=Math.abs(N1-0.1*N);
        Double n2=Math.abs(N2-0.2*N);
        Double n3=Math.abs(N3-0.4*N);
        Double n4=Math.abs(N4-0.2*N);
        Double n5=Math.abs(N5-0.1*N);

        return (n1+n2+n3+n4+n5)/N;

    }


    public static Double avgScore(List<AllAndHadVo> list){
        Integer sum=0;
        for(AllAndHadVo allAndHadVo:list){
            sum+=Integer.parseInt(allAndHadVo.getHadSum());
        }
        Double avg=sum/((double)list.size());
        return avg;
    }

    public static  Double getHard(Integer x1,Integer x2,Integer x3,Integer x4,Integer x5,Integer x){
        double n1=Math.abs(x1-0.1*x);
        double n2=Math.abs(x2-0.2*x);
        double n3=Math.abs(x3-0.3*x);
        double n4=Math.abs(x4-0.25*x);
        double n5=Math.abs(x5-0.15*x);
        return (n1+n2+n3+n4+n5)/x;
    }

    public static  Double getDPercent(Integer x1,Integer x2,Integer x3,Integer x4,Integer x5,Integer x){
        double n1=Math.abs(x1-0.2*x);
        double n2=Math.abs(x2-0.3*x);
        double n3=Math.abs(x3-0.3*x);
        double n4=Math.abs(x4-0.2*x);
        double n5=x5/2.0;
        return (n1+n2+n3+n4+n5)/x;
    }



}
