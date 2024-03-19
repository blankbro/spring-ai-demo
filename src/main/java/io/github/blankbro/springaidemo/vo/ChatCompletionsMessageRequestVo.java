package io.github.blankbro.springaidemo.vo;

import lombok.Data;

@Data
public class ChatCompletionsMessageRequestVo {
    private String role;
    private String content;
}
