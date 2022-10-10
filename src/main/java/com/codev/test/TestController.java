package com.codev.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(value = "/")
    public String main(){
        return "index";
    }

    @RequestMapping(value = "/jhlee")
    public String jhlee(){
        return "jhlee";
    }
}
