package com.itec1api.biblioteca.services;

import com.itec1api.biblioteca.DTO.AuthorRequestDTO;
import com.itec1api.biblioteca.DTO.AuthorResponseDTO;
import com.itec1api.biblioteca.entities.Author;
import com.itec1api.biblioteca.repositories.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorResponseDTO save(AuthorRequestDTO authorRequestDTO) {
        return null;
    }

    @Override
    public AuthorResponseDTO update(AuthorRequestDTO authorRequestDTO) {
        return null;
    }

    @Override
    public AuthorResponseDTO delete(String bookNameToDelete) {
        return null;
    }

    @Override
    public AuthorResponseDTO findOne(Integer id) {
        return null;
    }

    @Override
    public List<AuthorResponseDTO> findAll() {
        return null;
    }
}
