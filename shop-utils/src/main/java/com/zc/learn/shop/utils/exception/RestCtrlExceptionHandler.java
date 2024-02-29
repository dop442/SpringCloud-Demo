package com.zc.learn.shop.utils.exception;

import com.zc.learn.shop.utils.constants.HttpCode;
import com.zc.learn.shop.utils.resp.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class RestCtrlExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result<String> handlerException(Exception e){
        log.error("服务器抛出了异常", e);
        return new Result<>(HttpCode.FAILURE, "执行失败", e.getMessage());
    }

}
