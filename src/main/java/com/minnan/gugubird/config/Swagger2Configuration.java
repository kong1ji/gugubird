package com.minnan.gugubird.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {
    //api接口包扫描路径
    public static final String SWAGGER_SCAN_USER_PACKAGE = "com.minnan.gugubird.weibo";
    public static final String VERSION = "1.0.0";

    @Bean
    public Docket createUserRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("微博中心管理接口")
                .apiInfo(apiUserInfo())
                .select()
                .apis(Predicates.or(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_USER_PACKAGE),
                        RequestHandlerSelectors.basePackage(SWAGGER_SCAN_USER_PACKAGE)))//api接口包扫描路径
                .paths(PathSelectors.any())//可以根据url路径设置哪些请求加入文档，忽略哪些请求
                .build();
    }

    private ApiInfo apiUserInfo() {
        return new ApiInfoBuilder()
                .title("微博中心管理接口")//设置文档的标题
                .description("微博中心对接开发接口实现的文档")//设置文档的描述->1.Overview
                .version(VERSION)//设置文档的版本信息-> 1.1 Version information
                .build();
    }
}
