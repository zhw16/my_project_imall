package com.zhang.imall.exception;

import com.zhang.imall.common.ApiRestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  说明 ：@ControllerAdvice 配合 @ExceptionHandler 实现全局异常处理
 * 描述： 处理统一异常的handler
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    //统一异常的处理，不对外开放具体系统错误信息。
    private final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理系统异常
     *说明：   @ExceptionHandler(Exception.class)  进行全局的异常拦截
     * @param e 传递进来的异常
     * @return 系统异常，比较笼统
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handlerException(Exception e) {
        //传进来的错误信息，log记录一下
        log.error("default exception", e);
        //进行异常的统一，不进行具体原因的展示
        return ApiRestResponse.error(ImallExceptionEnum.SYSTEM_ERROR);
    }

    /**
     * 拦截 @ExceptionHandler(ImallException.class) 业务上的异常
     * @param e 传递进来的业务上的异常，不敏感的数据异常
     * @return
     */
    @ExceptionHandler(ImallException.class)
    @ResponseBody
    public Object handlerImallException(ImallException e) {
        //传进来的错误信息，log记录一下
        log.error("Imall Exception", e);
        //进行异常的统一，不进行具体原因的展示
        return ApiRestResponse.error(e.getCode(),e.getMessage());
    }
}
