package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @RequestMapping(value="/home")
    public String home(){
        System.out.println("redirect to home page!");
        return "index";
    }


    @RequestMapping(value="/home/page")
    @ResponseBody
    public ModelAndView goHome(){
        System.out.println("go to the home page!");
        ModelAndView mode = new ModelAndView();
        mode.addObject("name", "zhangsan");
        mode.setViewName("index");
        return mode;
    }


    @RequestMapping(value="/home/mv")
    @ResponseBody
    public ModelAndView goHomeByModeAndview(){
        System.out.println("go to the home page!");
        ModelAndView mode = new ModelAndView("index");
        mode.addObject("name", "zhangsan");
        return mode;
    }

    @RequestMapping(value="/home/res")
    @ResponseBody
    public String homeRes(){
        System.out.println("redirect to home page!");
        return "index";
    }

    @RequestMapping(value="/home/map")
    public Map<String,String> testMap(){

        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "lisi");
        return map;
    }
}