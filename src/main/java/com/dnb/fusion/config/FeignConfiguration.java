package com.dnb.fusion.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.dnb.fusion")
public class FeignConfiguration {

}
