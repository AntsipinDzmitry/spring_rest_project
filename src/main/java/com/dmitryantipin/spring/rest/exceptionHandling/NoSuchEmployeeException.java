package com.dmitryantipin.spring.rest.exceptionHandling;

//this ready-made exception is responsible
//        for telling the user in case of incorrect input when
//        trying to get information about the worker from the database

public class NoSuchEmployeeException extends RuntimeException {
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
