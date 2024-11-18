package com.grupo1.demo.Models;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private Set<Long> sistemaIds; // IDs de sistemas
}