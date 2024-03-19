package io.github.blankbro.springaidemo.vo;

import lombok.Data;

import java.util.List;

@Data
public class ChatCompletionsRequestVo {
    private List<ChatCompletionsMessageRequestVo> messages;
    private float temperature = 0.7F;
    private boolean stream = false;
}
