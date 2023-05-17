package com.itec1api.biblioteca.DTO.response;

import com.itec1api.biblioteca.DTO.request.BookRequestDTO;
import com.itec1api.biblioteca.entities.Book;
import lombok.Data;

@Data
public class BookResponseDTO {

    private String name;
    private String author;
    private String editorial;
    private Integer publishedYear;
    private String genre;

    public static BookResponseDTO toDTO(Book book) {
        BookResponseDTO bookResponseDTO = new BookResponseDTO();
        bookResponseDTO.setName(book.getName());
        bookResponseDTO.setEditorial(book.getEditorial());
        bookResponseDTO.setPublishedYear(book.getPublishedYear());
        return bookResponseDTO;
    }

    public Book fromDTO(BookRequestDTO bookRequestDTO) {
        Book book = new Book();
        book.setName(book.getName());
        book.setEditorial(book.getEditorial());
        book.setPublishedYear(book.getPublishedYear());
        return book;
    }

}
