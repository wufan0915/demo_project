package com.su.yoga.bean;

/**
 * 返回前段数据
 */
public class Result {
    //返回信息
    private String msg;
    //是否成功
    private Boolean success;
    //返回登录信息
    private Object Detail;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getDetail() {
        return Detail;
    }

    public void setDetail(Object detail) {
        Detail = detail;
    }
}
