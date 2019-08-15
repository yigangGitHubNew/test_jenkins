package com.example.test_jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2019/8/15
 * @Description
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        return "Hello World";
    }
}
