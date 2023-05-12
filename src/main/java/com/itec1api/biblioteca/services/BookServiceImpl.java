package com.itec1api.biblioteca.services;

import com.itec1api.biblioteca.DTO.BookRequestDTO;
import com.itec1api.biblioteca.DTO.BookResponseDTO;
import com.itec1api.biblioteca.entities.Book;
import com.itec1api.biblioteca.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService<BookRequestDTO, BookResponseDTO> {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    private Book fromRequestDTO(BookRequestDTO bookRequestDTO) {
        Book book = new Book();
        book.setName(bookRequestDTO.getName());
        book.setEditorial(bookRequestDTO.getEditorial());
        book.setPublishedYear(bookRequestDTO.getPublishedYear());
        return book;
    }

    @Override
    public BookResponseDTO save(BookRequestDTO bookRequestDTO) {
        Book book = new Book();
        book.setName(bookRequestDTO.getName());
        book.setAuthor(bookRequestDTO.getAuthor());
        book.setEditorial(bookRequestDTO.getEditorial());
        book.setPublishedYear(bookRequestDTO.getPublishedYear());
        book.setGenre(bookRequestDTO.getGenre());
        bookRepository.save(book);
        return new BookResponseDTO().toDTO(book);
    }

    @Override
    public BookResponseDTO update(BookRequestDTO bookRequestDTO, Integer id) {
        return null;
    }

    @Override
    public BookResponseDTO delete(Integer id) {
        return null;
    }

    @Override
    public BookResponseDTO findOne(Integer id) {
        return null;
    }

    @Override
    public List<BookResponseDTO> findAll() {
        BookResponseDTO bookResponseDTO = new BookResponseDTO();
        return this.bookRepository.getBooks().stream()
                .map(b -> bookResponseDTO.toDTO(b))
                .collect(Collectors.toList());
    }


    @Override
    public List<BookResponseDTO> findByName(String name) {
        BookResponseDTO bookResponseDTO = new BookResponseDTO();
        return this.bookRepository.getBooks().stream()
                .filter(b -> b.getName().matches(name))
                .map(b -> bookResponseDTO.toDTO(b))
                .collect(Collectors.toList());
    }
}
