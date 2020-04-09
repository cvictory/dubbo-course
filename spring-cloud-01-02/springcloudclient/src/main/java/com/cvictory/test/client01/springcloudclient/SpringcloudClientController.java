package com.cvictory.test.client01.springcloudclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cvictory ON 2020/4/9
 */
@Controller
@EnableFeignClients
public class SpringcloudClientController {
    @Autowired
    private GreetingClient greetingClient;


    @RequestMapping("/greeting.htm")
    public String greeting(Model model) {
        model.addAttribute("greeting", greetingClient.greeting());
        return "greeting-view";
    }
}
