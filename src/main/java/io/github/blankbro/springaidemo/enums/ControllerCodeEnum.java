package io.github.blankbro.springaidemo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ControllerCodeEnum {

    SUCCESS(1000, "成功"),
    ERROR(1001, "系统错误"),
    ;

    private final int code;
    private final String desc;
}
