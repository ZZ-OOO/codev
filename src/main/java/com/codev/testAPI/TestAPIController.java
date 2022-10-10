package com.codev.testAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestAPIController {
    @RequestMapping("/test/v1")
    @ResponseBody
    public String test(){
        return "test";
    }

}
