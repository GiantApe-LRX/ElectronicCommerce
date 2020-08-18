package com.cubemonkey.shop.comm;

/**
 * @author CubeMonkey
 * @create 2020-08-18 16:56
 */
public class CommonRes {

    /**
     * 表明处理的结果
     * "success" / "fail"
     */
    private String status;

    /**
     * 表示返回的结果
     * success返回对应的结果
     * fail返回错误码及错误描述
     */
    private Object data;

    public static CommonRes createCommonRes(Object data){
        return createCommonRes(data, "success");
    }

    public static CommonRes createCommonRes(Object data, String status){
        CommonRes commonRes = new CommonRes();
        commonRes.setData(data);
        commonRes.setStatus(status);
        return commonRes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
