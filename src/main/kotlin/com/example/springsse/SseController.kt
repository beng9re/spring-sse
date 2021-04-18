package com.example.springsse


import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter
import javax.websocket.server.PathParam


@RestController
class SseController(private val sseEmitter: SseEmitter ) {

  //sse 프로토콜 형성
  @GetMapping(value = ["/"] ,produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
  fun getData():SseEmitter = sseEmitter

  @GetMapping("/{value}")
  fun putData(@PathVariable value:String ){
    sseEmitter.send(value);
  }

}