package com.itec1api.biblioteca.entities;

import com.itec1api.biblioteca.DTO.BookRequestDTO;
import com.itec1api.biblioteca.DTO.BookResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
    private String name;
    private Genre genre;
    private String editorial;
    private Integer publishedYear;
    private Author autor;

    public BookResponseDTO toDTO(Book book) {
        BookResponseDTO bookResponseDTO = new BookResponseDTO();
        bookResponseDTO.setName(book.name);
        bookResponseDTO.setGenre(book.genre.getDescription());
        return bookResponseDTO;
    }
}
