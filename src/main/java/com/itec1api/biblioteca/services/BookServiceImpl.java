package com.itec1api.biblioteca.services;

import com.itec1api.biblioteca.DTO.BookRequestDTO;
import com.itec1api.biblioteca.DTO.BookResponseDTO;
import com.itec1api.biblioteca.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService<BookRequestDTO, BookResponseDTO> {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookResponseDTO save(BookRequestDTO bookRequestDTO) {
        return null;
    }

    @Override
    public BookResponseDTO update(BookRequestDTO bookRequestDTO) {
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
        return this.bookRepository.getBooks().stream()
                .map(b -> b.toDTO(b))
                .collect(Collectors.toList());
    }

    @Override
    public List<BookResponseDTO> findByName(String name) {
        return this.bookRepository.getBooks().stream()
                .filter(b -> b.getName().matches(name))
                .map(b -> b.toDTO(b))
                .collect(Collectors.toList());
    }
}
