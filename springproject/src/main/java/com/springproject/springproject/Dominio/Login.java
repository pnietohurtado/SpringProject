package com.springproject.springproject.Dominio;

public class Login {
    private String username;
    private String password;

    public Login(){}
    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username){this.username = username; }
    public void setPassword(String password){this.password = password;}
    public String setUsername(){return this.username;}
    public String setPassword(){return this.password; }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Username: ").append(this.username).append(" Password: ").append(this.password).append("\n");
        return sb.toString();
    }
}
