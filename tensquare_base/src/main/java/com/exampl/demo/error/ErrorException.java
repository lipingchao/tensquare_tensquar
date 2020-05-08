package com.exampl.demo.error;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @User lpc/李金超
 * @ClassName ErrorExcepotion  类名
 * @Author AUSUA  作者
 * @Date 2020/5/8 23:04  时间
 * @Version 1.0 版本
 */
@ControllerAdvice
public class ErrorException {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception exception){
        exception.printStackTrace();
        return new Result(false, StatusCode.ERROR,"系统异常，请联系管理员！！");
    }

}
