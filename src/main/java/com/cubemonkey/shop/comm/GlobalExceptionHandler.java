package com.cubemonkey.shop.comm;

import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author CubeMonkey
 * @create 2020-08-18 17:59
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonRes doError(HttpServletRequest request, HttpServletResponse response, Exception excetion){
        if (excetion instanceof  BusinessException){
            return  CommonRes.createCommonRes(((BusinessException)excetion).getCommonError(),"fail");
        }else if(excetion instanceof NoHandlerFoundException){
            CommonError commonError = new CommonError(EmBusinessError.NO_HANDLER_FOUND);
            return CommonRes.createCommonRes(commonError,"fail");
        }else if(excetion instanceof ServletRequestBindingException){
            CommonError commonError = new CommonError(EmBusinessError.BIND_EXCEPTION_FOUND);
            return CommonRes.createCommonRes(commonError,"fail");
        }else {
            CommonError commonError = new CommonError(EmBusinessError.UNKNOWN_ERROR);
            return CommonRes.createCommonRes(commonError,"fail");
        }

    }

}