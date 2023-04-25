package com.dmitryantipin.spring.rest.exceptionHandling;

//in case of throwing our ready-made exception, this object is added to the http response body

public class EmployeeIncorrectData {
    private String info;

    public EmployeeIncorrectData() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
