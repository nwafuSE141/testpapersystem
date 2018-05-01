package edu.nwafu.testpapersystem.domain.Vo;

public class ScoreVo {

    private String ptype;


    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public Float getQuestionScore() {
        return questionScore;
    }

    public void setQuestionScore(Float questionScore) {
        this.questionScore = questionScore;
    }

    private Float questionScore;



}
