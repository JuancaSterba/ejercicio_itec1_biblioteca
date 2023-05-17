package com.itec1api.biblioteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Book {

    private String isbn;
    private String name;
    private List<Author> authors;
    private String editorial;
    private Integer publishedYear;
    private List<Genre> genres;
    private List<BookCopy> copies;

    public Book(String isbn, String name, String editorial, Integer publishedYear) {
        this.isbn = isbn;
        this.name = name;
        this.editorial = editorial;
        this.publishedYear = publishedYear;
    }
}
