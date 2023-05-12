package com.itec1api.biblioteca.controllers;

import com.itec1api.biblioteca.DTO.BookRequestDTO;
import com.itec1api.biblioteca.DTO.BookResponseDTO;
import com.itec1api.biblioteca.repositories.BookRepository;
import com.itec1api.biblioteca.services.BookService;
import com.itec1api.biblioteca.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libraries/books")
public class BookController {
    @Autowired
    private BookServiceImpl bookServiceImpl;
    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<BookResponseDTO>> getAll() {
        List<BookResponseDTO> responseDTOS = bookServiceImpl.findAll();
        return new ResponseEntity<>(responseDTOS, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<BookResponseDTO>> getOne(@RequestParam String name) {
        List<BookResponseDTO> responseDTOS = bookServiceImpl.findByName(name);
        return new ResponseEntity<>(responseDTOS, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<BookResponseDTO> save(@RequestBody BookRequestDTO requestDTO) {
        BookResponseDTO responseDTO = bookServiceImpl.save(requestDTO);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }


    @RequestMapping(value = "/{name}", method = RequestMethod.PUT)
    public ResponseEntity<Object> update(@PathVariable Long id) { return null; }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable Long id) { return null; }

}
