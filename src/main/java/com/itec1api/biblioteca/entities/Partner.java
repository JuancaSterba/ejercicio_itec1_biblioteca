package com.itec1api.biblioteca.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Partner {
    private Integer partNumber;
    private Integer dni;
    private String name;
    private String lastName;
}
