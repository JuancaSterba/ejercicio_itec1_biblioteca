package com.itec1api.biblioteca.DTO;

import com.itec1api.biblioteca.entities.Book;
import lombok.Data;

@Data
public class BookResponseDTO {

    private String name;
    private String author;
    private String editorial;
    private Integer publishedYear;
    private String genre;

    public BookResponseDTO toDTO(Book book) {
        BookResponseDTO bookResponseDTO = new BookResponseDTO();
        bookResponseDTO.setName(book.getName());
        bookResponseDTO.setAuthor(book.getAuthor());
        bookResponseDTO.setEditorial(book.getEditorial());
        bookResponseDTO.setPublishedYear(book.getPublishedYear());
        bookResponseDTO.setGenre(book.getGenre());
        return bookResponseDTO;
    }

    public Book fromDTO(BookRequestDTO bookRequestDTO) {
        Book book = new Book();
        book.setName(book.getName());
        book.setAuthor(book.getAuthor());
        book.setEditorial(book.getEditorial());
        book.setPublishedYear(book.getPublishedYear());
        book.setGenre(book.getGenre());
        return book;
    }

}
