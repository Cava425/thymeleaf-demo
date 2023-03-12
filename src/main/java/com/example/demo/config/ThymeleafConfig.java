package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

import java.util.List;

@Configuration
public class ThymeleafConfig {


    @Bean
    SpringResourceTemplateResolver springResourceTemplateResolver(){
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setPrefix("classpath:/templates/");
        resolver.setSuffix(".js");

        resolver.setCharacterEncoding("UTF-8");
        resolver.setTemplateMode(TemplateMode.JAVASCRIPT);
        return resolver;
    }


    @Bean
    SpringTemplateEngine templateEngine(List<SpringResourceTemplateResolver> resolvers){
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        for(SpringResourceTemplateResolver resolver : resolvers){
            templateEngine.addTemplateResolver(resolver);
        }
        return templateEngine;
    }

}
