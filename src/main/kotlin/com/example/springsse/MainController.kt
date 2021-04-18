package com.example.springsse

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {

  @GetMapping("/index")
  fun main() = "index"
}