package com.ssm.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exception")
public class ControllerException {

    @GetMapping
    @ResponseBody
    public ModelAndView exception(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("errorException");
        return mv;
    }

}
