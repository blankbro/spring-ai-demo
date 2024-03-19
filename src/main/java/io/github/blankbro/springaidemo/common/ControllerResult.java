package io.github.blankbro.springaidemo.common;

import io.github.blankbro.springaidemo.enums.ControllerCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ControllerResult {
    private int code;
    private String desc;
    private Object data;

    public ControllerResult(ControllerCodeEnum controllerCodeEnum, Object data) {
        this.code = controllerCodeEnum.getCode();
        this.desc = controllerCodeEnum.getDesc();
        this.data = data;
    }

    public static ControllerResult success() {
        return success(null);
    }

    public static ControllerResult error() {
        return new ControllerResult(ControllerCodeEnum.ERROR, null);
    }

    public static ControllerResult success(Object data) {
        return new ControllerResult(ControllerCodeEnum.SUCCESS, data);
    }

    public static ControllerResult error(String errorInfo) {
        return new ControllerResult(ControllerCodeEnum.ERROR.getCode(), errorInfo, null);
    }
}
