package com.susu.wiki;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class WiKiApplication {

    private static final Logger LOG = LoggerFactory.getLogger(WiKiApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WiKiApplication.class);
        ConfigurableEnvironment env = app.run(args).getEnvironment();
        LOG.info("苏苏的项目启动成功啦！");
        LOG.info("地址：\thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
