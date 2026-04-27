package com.springproject.springproject.Dominio.Model;

import java.util.UUID;

public record User
        (
                 UUID id,
                 String username,
                 String password,
                 String email,
                 String firstName,
                 String lastName
        )
{
}
