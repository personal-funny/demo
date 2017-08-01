/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.air.common.converter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zdh48304
 * @version GlobalExceptionHandler 2017/6/30 13:44 Exp $
 * @description
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    public static final String DEFAULT_ERROR_VIEW = "error";


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonResponse defaultErrorHandler(HttpServletRequest req, HttpServletResponse res, Exception e) throws Exception {
        LocalJsonResponse response = new LocalJsonResponse();
        response.setStatus(res.getStatus());
        response.setMessage(e.getMessage());
        return response;
    }
}
