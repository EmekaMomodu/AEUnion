package com.EmekaMomodu.AEUnion.controller;

import com.EmekaMomodu.AEUnion.model.PaymentInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String home(){
        return "wedding";
    }

    @GetMapping("/registry")
    public String registry(Model model){
        PaymentInfo paymentInfo = new PaymentInfo();
        model.addAttribute("paymentInfo", paymentInfo);
        return "registry";
    }

    @PostMapping("/paystack")
    public String paystack(@ModelAttribute("paymentInfo") PaymentInfo paymentInfo){
        LOGGER.info("paymentInfo::: " + paymentInfo);
        return "paystack_checkout";
    }
}
