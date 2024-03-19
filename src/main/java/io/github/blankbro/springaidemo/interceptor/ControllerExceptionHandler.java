package io.github.blankbro.springaidemo.interceptor;

import io.github.blankbro.springaidemo.common.ControllerResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Object exceptionHandler(Exception e) {
        log.error(e.getMessage(), e);
        return ControllerResult.error(e.getMessage());
    }
}
