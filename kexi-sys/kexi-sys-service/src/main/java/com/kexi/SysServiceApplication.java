package com.kexi;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kexifa
 * @version 1.0
 * @date 2023/5/9 10:05
 */
@SpringBootApplication
@EnableKnife4j
@MapperScan("com.kexi.mapper")
public class SysServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SysServiceApplication.class,args);
    }
}
