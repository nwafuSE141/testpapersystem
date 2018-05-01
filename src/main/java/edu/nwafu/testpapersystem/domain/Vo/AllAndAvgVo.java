package edu.nwafu.testpapersystem.domain.Vo;

import java.io.Serializable;

public class AllAndAvgVo  implements Serializable{
    //    总分
    private String allscore;
    //    平均分
    private String avgscore;

    public String getPointname() {
        return pointname;
    }

    public void setPointname(String pointname) {
        this.pointname = pointname;
    }

    private String pointname;

    public String getAllscore() {
        return allscore;
    }

    public void setAllscore(String allscore) {
        this.allscore = allscore;
    }

    public String getAvgscore() {
        return avgscore;
    }

    public void setAvgscore(String avgscore) {
        this.avgscore = avgscore;
    }

    public AllAndAvgVo() {

    }
}
