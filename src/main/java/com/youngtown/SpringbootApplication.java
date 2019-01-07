package com.youngtown;

import com.youngtown.common.constants.StringConstants;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 启动类
 */
@SpringBootApplication
@EnableAutoConfiguration
public class SpringbootApplication {

    public static void main(String[] args) {
        System.out.println(StringConstants.LOG_HEAD + "项目启动");
        new SpringApplicationBuilder().sources(SpringbootApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
