package com.vastika.uim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping(value="/gr")
    public ModelAndView greet()
    {
        ModelAndView view=new ModelAndView("hello");
        return view;
    }
}
