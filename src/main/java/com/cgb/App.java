package com.cgb;

import com.cgb.config.DBConfig1;
import com.cgb.config.DBConfig2;
import com.cgb.ruan.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan(basePackages = { "com.cgb.api.controller","com.cgb.config","com.cgb.datasource", "com.cgb.ehcache","com.cgb.ruan","com.cgb.youxianqi"})
@SpringBootApplication
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
@EnableAsync
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
