package com.EmekaMomodu.AEUnion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author CMOMODU
 * @version 1.0
 * @date 10/14/21 7:59 PM
 */
@Controller
public class ApplicationController {

    @GetMapping("/")
    public String home(){
        return "homeGolden";
    }
}
