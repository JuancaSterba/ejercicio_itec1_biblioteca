package com.itec1api.biblioteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
public class Author {
    private String fullName;
    private String nationality;
    private LocalDate birthdate;
}
