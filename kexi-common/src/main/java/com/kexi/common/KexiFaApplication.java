package com.kexi.common;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@EnableKnife4j
@SpringBootApplication(scanBasePackages="com.kexi.*")
//@EnableFeignClients(basePackages = "com.hierway.*")
@RefreshScope
//@Import(SwaggerConfig.class)
public @interface KexiFaApplication {
}
