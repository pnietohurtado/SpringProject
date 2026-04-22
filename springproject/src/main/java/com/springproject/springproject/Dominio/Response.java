package com.springproject.springproject.Infrastructure.DTO;


public class ResponseDTO {
    private String message;
    private int numErrors;

    public ResponseDTO(){}

    public void setMessage(String message){this.message = message; }
    public String getMessage(){return this.message; }
    public void setNumErrors(int numErrors){this.numErrors = numErrors; }
    public int getNumErrors(){return this.numErrors; }

}
