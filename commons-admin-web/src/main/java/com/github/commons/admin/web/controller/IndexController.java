package com.github.commons.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by xiongqi on 2018/6/14.
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

}
