package com.itec1api.biblioteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Book {

    private String name;
    private String author;
    private String editorial;
    private Integer publishedYear;
    private String genre;

}
