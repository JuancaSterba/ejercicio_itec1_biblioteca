package com.itec1api.biblioteca.services;

import com.itec1api.biblioteca.DTO.BookRequestDTO;
import com.itec1api.biblioteca.DTO.BookResponseDTO;

import java.util.List;

public interface BookService<REQUEST, RESPONSE> extends ICRUD<BookRequestDTO, BookResponseDTO> {
    public List<RESPONSE> findByName(String name);
}
