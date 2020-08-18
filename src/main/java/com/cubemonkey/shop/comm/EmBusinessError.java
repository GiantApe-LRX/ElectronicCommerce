package com.cubemonkey.shop.comm;

/**
 * @author CubeMonkey
 * @create 2020-08-18 17:07
 */
public enum EmBusinessError {
    NO_OBJECT_FOUND(10000, "请求对象不存在"),
    UNKNOWN_ERROR(10001, "未知的错误"),
    NO_HANDLER_FOUND(10002, "找不到对应的路径"),
    BIND_EXCEPTION_FOUND(10003, "参数错误"),
    ;
    private Integer errCode;
    private String errMsg;

    EmBusinessError(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
