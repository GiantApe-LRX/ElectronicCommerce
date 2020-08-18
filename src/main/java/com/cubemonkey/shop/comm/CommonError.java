package com.cubemonkey.shop.comm;

/**
 * @author CubeMonkey
 * @create 2020-08-18 16:54
 * 错误处理
 */
public class CommonError {
    /**
     *错误代码
     */
    private Integer errCode;
    /**
     * 错误描述
     */
    private String errMsg;

    public CommonError(EmBusinessError emBusinessError){
        this.errCode = emBusinessError.getErrCode();
        this.errMsg = emBusinessError.getErrMsg();
    }

    public CommonError(Integer errCode, String errMsg) {
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
