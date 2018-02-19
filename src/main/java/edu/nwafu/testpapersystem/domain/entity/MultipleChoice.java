package edu.nwafu.testpapersystem.domain.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class MultipleChoice implements Serializable {
    
    private Integer id;

    
    private String question;

    
    private String answer;

    
    private String a;

    
    private String b;

    
    private String c;

    
    private String d;

    
    private String e;

    
    private String difficult;

    
    private String faq;

    
    private Integer score;

    
    private Integer courseId;

    
    private Integer pointId;

    
    private Integer userId;

    
    private Integer usageCount;

    
    private Integer stat;

    
    private Timestamp createTime;

    
    private static final long serialVersionUID = 1L;

    
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getQuestion() {
        return question;
    }

    
    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    
    public String getAnswer() {
        return answer;
    }

    
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    
    public String getA() {
        return a;
    }

    
    public void setA(String a) {
        this.a = a == null ? null : a.trim();
    }

    
    public String getB() {
        return b;
    }

    
    public void setB(String b) {
        this.b = b == null ? null : b.trim();
    }

    
    public String getC() {
        return c;
    }

    
    public void setC(String c) {
        this.c = c == null ? null : c.trim();
    }

    
    public String getD() {
        return d;
    }

    
    public void setD(String d) {
        this.d = d == null ? null : d.trim();
    }

    
    public String getE() {
        return e;
    }

    
    public void setE(String e) {
        this.e = e == null ? null : e.trim();
    }

    
    public String getDifficult() {
        return difficult;
    }

    
    public void setDifficult(String difficult) {
        this.difficult = difficult == null ? null : difficult.trim();
    }

    
    public String getFaq() {
        return faq;
    }

    
    public void setFaq(String faq) {
        this.faq = faq == null ? null : faq.trim();
    }

    
    public Integer getScore() {
        return score;
    }

    
    public void setScore(Integer score) {
        this.score = score;
    }

    
    public Integer getCourseId() {
        return courseId;
    }

    
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    
    public Integer getPointId() {
        return pointId;
    }

    
    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    
    public Integer getUserId() {
        return userId;
    }

    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    public Integer getUsageCount() {
        return usageCount;
    }

    
    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    
    public Integer getStat() {
        return stat;
    }

    
    public void setStat(Integer stat) {
        this.stat = stat;
    }

    
    public Timestamp getCreateTime() {
        return createTime;
    }

    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}