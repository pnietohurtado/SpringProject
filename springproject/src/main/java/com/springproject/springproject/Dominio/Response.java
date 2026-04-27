package com.springproject.springproject.Dominio;

public class Response {
    private String message;
    private int numErrors;

    public Response() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setNumErrors(int numErrors) {
        this.numErrors = numErrors;
    }

    public int getNumErrors() {
        return this.numErrors;
    }

}
