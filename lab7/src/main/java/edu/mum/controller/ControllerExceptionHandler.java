package edu.mum.controller;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;

@ControllerAdvice
public class ControllerExceptionHandler { public static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler(FileNotFoundException.class)
    public ModelAndView handlerError(HttpServletRequest request, FileNotFoundException exception) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("fileNotFound", exception.getMessage());
        mav.setViewName("FileNotFound");
        return mav;
    }

    @ExceptionHandler(value = Exception.class)
    public  ModelAndView defaultErrorHandle(HttpServletRequest request, Exception e)throws Exception{
        if(AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class)!= null) throw e;
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", request.getRequestURI());
        mav.setViewName(DEFAULT_ERROR_VIEW);

        return mav;
    }

}
