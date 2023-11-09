package com.siyamuddinproject.BookStore.Exception;

import org.springframework.http.HttpStatus;

public class BookException {
    private String massage;
    private Throwable throwable;
    private HttpStatus httpStatus;

    public BookException() {
    }

    public BookException(String massage, Throwable throwable, HttpStatus httpStatus) {
        this.massage = massage;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

    public String getMassage() {
        return massage;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
