package com.cvictory.test.client01.springcloudserver;

import com.cvictory.test01.SpringCloudGreetingService;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cvictory ON 2020/4/9
 */
@RestController
public class GreetingServiceController implements SpringCloudGreetingService {
    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Override
    @RequestMapping("/greeting")
    public String greeting(String name) {
        return String.format(
                "Greeting from '%s'!", eurekaClient.getApplication(appName).getName());
    }
}
