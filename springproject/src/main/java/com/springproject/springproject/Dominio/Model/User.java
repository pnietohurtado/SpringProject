package com.springproject.springproject.Dominio.Model;

import java.util.UUID;

public record User
/*In this class this is just a POJO class which
* only have the logic of the user without any getter nor setter */
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
