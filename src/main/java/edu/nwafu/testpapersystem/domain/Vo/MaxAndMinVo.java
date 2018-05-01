package edu.nwafu.testpapersystem.domain.Vo;

public class MaxAndMinVo {
    private String  maxScore;

    private String  minScore;

    private String  avgScore;

    private String  countPerson;


    public double getStandard() {
        return standard;
    }

    public void setStandard(double standard) {
        this.standard = standard;
    }

    private double standard;


    public String getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(String maxScore) {
        this.maxScore = maxScore;
    }

    public String getMinScore() {
        return minScore;
    }

    public void setMinScore(String minScore) {
        this.minScore = minScore;
    }

    public String getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(String avgScore) {
        this.avgScore = avgScore;
    }

    public String getCountPerson() {
        return countPerson;
    }

    public void setCountPerson(String countPerson) {
        this.countPerson = countPerson;
    }
}
