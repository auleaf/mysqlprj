package com.yyzq.sqlserver.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()) // 调用apiInfo方法
                .pathMapping("/") //配置访问路径
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yyzq.sqlserver.controller"))//api接口包扫描路径
                .paths(PathSelectors.regex("/.*")) //可以根据url路径设置哪些请求加入文档，忽略哪些请求
                .build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("operate table doc ver1.0")//设置文档的标题
                .description("you can click Api link.")//设置文档的描述
                .contact(new Contact("demoprj","www.google.com", "XXXX@XX.com"))//设置文档的联系方式
                .version("1.0.1")
                .license("All Right Reserved")
                .licenseUrl("http://www.google.com")
                .build();
    }
}
