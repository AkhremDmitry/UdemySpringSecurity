package com.oreilly.security.web.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController extends RuntimeException{

    @ExceptionHandler(Exception.class)
    public final String exceptionHandler(final Exception  ex,
                                         final Model model) {
        model.addAttribute("Text", ex.getMessage().toString());
        return "error";
    }
}
