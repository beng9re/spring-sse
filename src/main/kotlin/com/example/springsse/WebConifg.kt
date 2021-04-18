package com.example.springsse;

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.view.InternalResourceViewResolver
import org.springframework.web.servlet.view.JstlView
import org.thymeleaf.spring5.view.ThymeleafViewResolver

@Configuration
@EnableWebMvc
class WebConifg :WebMvcConfigurer {

  @Bean
  fun viewSet():ViewResolver {
    val resolver = ThymeleafViewResolver()
    return resolver
  }
}
