package com.siyamuddinproject.BookStore.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookExceptionHandler {
    @ExceptionHandler(value ={BookNotFoundException.class})
    public static ResponseEntity<Object> handleException(BookNotFoundException bookNotFoundException)
    {
        BookException bookException=new BookException(bookNotFoundException.getMessage(),bookNotFoundException.getCause(),HttpStatus.NOT_FOUND);

                return new ResponseEntity<>(bookException,HttpStatus.NOT_FOUND);
    }

}
