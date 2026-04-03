package com.springproject.springproject.Dominio.Model;

public enum Role {
    LOCAL ("Local"),
    ADMIN ("Admin"),
    CLIENT ("Client");

    private String name; 

    private Role(String name){
        this.name = name;
    }
}
