package io.github.blankbro.springaidemo.controller;

import io.github.blankbro.springaidemo.vo.ChatCompletionsRequestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.azure.openai.AzureOpenAiChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AzureOpenAIController {

    @Autowired
    private AzureOpenAiChatClient azureOpenAiChatClient;

    @PostMapping("/chat/completions")
    public Object chatCompletion(@RequestBody ChatCompletionsRequestVo request) {
        if (request.isStream()) {
            return azureOpenAiChatClient.stream("null");
        } else {
            return azureOpenAiChatClient.call("null");
        }
    }
}
