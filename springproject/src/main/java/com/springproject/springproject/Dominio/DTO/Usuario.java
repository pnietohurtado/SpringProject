package com.springproject.springproject.Dominio.DTO;

public class Usuario {
    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private String password;

    public Usuario(){

    }

    public Usuario(String email,String username,String firstName,String lastName, String password){
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

}
