package com.EmekaMomodu.AEUnion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * @author CMOMODU
 * @version 1.0
 * @date 10/14/21 7:59 PM
 */
@Controller
public class ApplicationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);

    @GetMapping("/")
    public String home(HttpServletResponse response){
        return "wedding";
    }

    @GetMapping("/registry")
    public String registry(){
        return "registry";
    }
}
