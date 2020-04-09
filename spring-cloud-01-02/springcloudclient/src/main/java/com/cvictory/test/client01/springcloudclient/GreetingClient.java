package com.cvictory.test.client01.springcloudclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cvictory ON 2020/4/9
 */
@FeignClient("spring-cloud-server")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();
}
