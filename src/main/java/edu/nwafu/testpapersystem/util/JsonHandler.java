package edu.nwafu.testpapersystem.util;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class JsonHandler {

    private static JSONObject json;

    public static JSONObject jsonFail(String code, String message){
        json=new JSONObject();
        json.put("returnCode",code);
        json.put("errorMsg",message);
        return json;
    }

    public static JSONObject jsonFail(String message){
        json=new JSONObject();
        json.put("returnCode","001");
        json.put("errorMsg",message);
        return json;
    }

    public static JSONObject jsonSuccess(String message){
        json=new JSONObject();
        json.put("returnCode","000");
        json.put("errorMsg",message);
        return json;
    }

    public static JSONObject jsonSuccess(JSONObject message){
        json=new JSONObject();
        json.put("returnCode","000");
        json.put("data",message);
        return json;
    }

    public static JSONObject jsonSuccess(List message){
        json=new JSONObject();
        json.put("returnCode","000");
        json.put("data",message);
        return json;
    }


}
