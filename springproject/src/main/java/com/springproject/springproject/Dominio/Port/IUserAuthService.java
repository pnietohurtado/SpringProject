package com.springproject.springproject.Dominio.Port;

import com.springproject.springproject.Infrastructure.DTO.ResponseDTO;

import java.util.HashMap;

public interface IUserAuthService

    /*
    *
    * Inside this class we are going to work with the functions that the user will have
    * in the process of authenticate himself into the backend service
    * */

{

    public HashMap<String, String> login (String id) throws Exception;
    public Response register(Response register) throws Exception;

}
