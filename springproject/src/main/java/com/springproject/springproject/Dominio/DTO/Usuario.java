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

    public String getEmail(){return this.email;}
    public String getUsername(){return this.username;}
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public String getPassword(){return this.password;}

    public void setEmail(String email){this.email = email; }
    public void setUsername(String username){this.username = username; }
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName; }
    public void setPassword(String password){this.password = password; }


}
