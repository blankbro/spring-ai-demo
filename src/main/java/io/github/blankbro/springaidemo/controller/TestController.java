package io.github.blankbro.springaidemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @Autowired
    private ChatClient chatClient;

    @GetMapping("/ai/simple")
    public Object completion(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
        return chatClient.call(message);
    }
}
