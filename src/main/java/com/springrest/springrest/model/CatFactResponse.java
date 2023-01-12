package com.springrest.springrest.model;

public class CatFactResponse {

    private String fact;
    private Integer length;

    public CatFactResponse() {
    }

    public CatFactResponse(String fact, Integer length) {
        this.fact = fact;
        this.length = length;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
