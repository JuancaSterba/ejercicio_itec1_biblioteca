package com.itec1api.biblioteca.repositories;

import com.itec1api.biblioteca.DTO.AuthorRequestDTO;
import com.itec1api.biblioteca.DTO.AuthorResponseDTO;
import com.itec1api.biblioteca.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
