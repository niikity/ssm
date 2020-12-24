package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Controller
@RequestMapping("/hello")
public class IndexController {

    @Resource
    private com.ssm.service.indexService indexServiceImpl;

    @RequestMapping(value = "/index",method= RequestMethod.GET)
    @ResponseBody
    public String index(){
//        return indexServiceImpl.selectAll();
        throw new NullPointerException();
    }
}
