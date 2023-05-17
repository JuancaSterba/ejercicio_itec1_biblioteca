package com.itec1api.biblioteca.services;

import com.itec1api.biblioteca.DTO.request.BookRequestDTO;
import com.itec1api.biblioteca.DTO.response.BookResponseDTO;

import java.util.List;

public interface BookService extends ICRUD<BookRequestDTO, BookResponseDTO> {
    public List<BookResponseDTO> findByName(String name);
}
