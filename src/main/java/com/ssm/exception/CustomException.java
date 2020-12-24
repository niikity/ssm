package com.ssm.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class CustomException {

    @ExceptionHandler(Exception.class)
    public Object  exception(HttpServletRequest request, Exception e){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("errorException");
        System.err.println("异常捕获!");
        return mv;
    }

}
