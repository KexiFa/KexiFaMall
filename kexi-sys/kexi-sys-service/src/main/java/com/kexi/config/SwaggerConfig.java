package com.kexi.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableKnife4j
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("接口文档")
                .version("1.0.0")
                .termsOfServiceUrl("")
                .license("")
                .licenseUrl("")
                .build();
    }
//private String basePackage = "cn.kexi.controller";
//    //分组名称
//    private String groupName = "makabaka";
//    //主机名
//    private String host = "Url";
//    //标题
//    private String title = "在线API文档";
//    //简介
//    private String description = "在线API文档";
//    //服务条款URL
//    private String termsOfServiceUrl = "http://www.apache.org/licenses/LICENSE-2.0";
//    //联系人
//    private String contactName = "韬崽";
//    // 联系网址
//    private String contactUrl = "Url";
//    // 联系邮箱
//    private String contactEmail = "Url";
//    //版本号
//    private String version = "1.0.0";
//
//
//    @Bean
//    public Docket docket() {
//        String groupName = "1.0.0";
//        Docket docket = new Docket(DocumentationType.SWAGGER_2)
//                .host(host)
//                .apiInfo(apiInfo())
//                .groupName(groupName)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.kexi.*"))
//                .paths(PathSelectors.any())
//                .build();
//        return docket;
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title(title)
//                .description(description)
//                .termsOfServiceUrl(termsOfServiceUrl)
//                .contact(new Contact(contactName, contactUrl, contactEmail))
//                .version(version)
//                .build();
//    }
}
