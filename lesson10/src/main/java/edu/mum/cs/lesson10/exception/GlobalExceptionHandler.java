package edu.mum.cs.lesson10.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ValidationErrorDTO handleValidationException(MethodArgumentNotValidException e){
        BindingResult result = e.getBindingResult();
        List<FieldError> fieldErrorList = result.getFieldErrors();
        ValidationErrorDTO dto = new ValidationErrorDTO();
        dto.setErrorType("ValidationError");

        for(FieldError error : fieldErrorList){
            dto.addFieldError(error.getField(), error.getDefaultMessage());
        }
        return dto;
    }
}
