package com.nhnacademy.hello.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
    @GetMapping(value = {"/index.html","/"})
    public String index(){
        return "index/index";
    }
}
