package com.siyamuddinproject.BookStore.Responses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class BookResponse {
    public static ResponseEntity<Object> responseBuilder(String massage, HttpStatus httpStatus, Object responseObject)
    {
        Map<String,Object> response=new HashMap<>();
        response.put("MASSAGE",massage);
        response.put("HTTPSTATUS",httpStatus);
        response.put("DATA",responseObject);

        return new ResponseEntity<>(response,httpStatus);

    }
}
