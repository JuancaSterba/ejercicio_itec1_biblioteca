package com.itec1api.biblioteca.services;

import com.itec1api.biblioteca.DTO.request.BookRequestDTO;
import com.itec1api.biblioteca.DTO.response.BookResponseDTO;
import com.itec1api.biblioteca.entities.Book;
import com.itec1api.biblioteca.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public BookResponseDTO save(BookRequestDTO bookRequestDTO) {
        Book book = new Book();
        book.setName(bookRequestDTO.getName());
        book.setEditorial(bookRequestDTO.getEditorial());
        book.setPublishedYear(bookRequestDTO.getPublishedYear());
        bookRepository.save(book);
        return new BookResponseDTO().toDTO(book);
    }
    @Override
    public BookResponseDTO update(BookRequestDTO bookRequestDTO) {
        Book bookToUpdate = new Book();
        Book updatedBook = bookRepository.update(bookToUpdate);
        if (updatedBook != null) {
            new BookResponseDTO();
            return BookResponseDTO.toDTO(updatedBook);
        } else {
            return null; // or throw an exception, depending on your design
        }
    }
    @Override
    public BookResponseDTO delete(String name) {
        Book deletedBook = bookRepository.deleteByName(name);
        if (deletedBook != null) {
            new BookResponseDTO();
            return BookResponseDTO.toDTO(deletedBook);
        } else {
            return null;
        }
    }
    @Override
    public BookResponseDTO findById(Long id) {
        return null;
    }
    @Override
    public List<BookResponseDTO> findAll() {
        for (Book b: bookRepository.getBooks()) {
            System.out.println(b.getName());
        }
        return this.bookRepository.getBooks()
                .stream()
                .map(b -> BookResponseDTO.toDTO(b))
                .collect(Collectors.toList());
    }
    @Override
    public List<BookResponseDTO> findByName(String nameToSearch) {
        List<Book> books = bookRepository.findByName(nameToSearch);
        return books.stream()
                .map(BookResponseDTO::toDTO)
                .collect(Collectors.toList());
    }
}
