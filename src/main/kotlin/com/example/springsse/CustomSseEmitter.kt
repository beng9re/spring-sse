package com.example.springsse

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter

@Configuration
class CustomSseEmitter {

  @Bean
  fun beanSsemitter() = SseEmitter(-1)
}