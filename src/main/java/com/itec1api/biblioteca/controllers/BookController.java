package com.itec1api.biblioteca.controllers;

import com.itec1api.biblioteca.DTO.BookRequestDTO;
import com.itec1api.biblioteca.DTO.BookResponseDTO;
import com.itec1api.biblioteca.repositories.BookRepository;
import com.itec1api.biblioteca.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/libraries/books")
public class BookController {

    private BookService bookService;

    private BookRepository bookRepository;

    public BookController(BookService bookService, BookRepository bookRepository) {
        this.bookService = bookService;
        this.bookRepository = bookRepository;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<BookResponseDTO>> getAll() {
        List<BookResponseDTO> responseDTOS = bookService.findAll();
        return new ResponseEntity<>(responseDTOS, HttpStatus.OK);
    }

    @RequestMapping(value = "/{nameToSearch}", method = RequestMethod.GET)
    public ResponseEntity<List<BookResponseDTO>> getOne(@PathVariable String nameToSearch) {
        List<BookResponseDTO> bookResponseDTO = bookService.findByName(nameToSearch);
        return new ResponseEntity<>(bookResponseDTO, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<BookResponseDTO> save(@RequestBody BookRequestDTO requestDTO) {
        BookResponseDTO responseDTO = bookService.save(requestDTO);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable Long id) { return null; }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public ResponseEntity<BookResponseDTO> update(@RequestBody BookRequestDTO requestDTO) {
        BookResponseDTO bookResponseDTO = bookService.update(requestDTO);
        return new ResponseEntity<>(bookResponseDTO, HttpStatus.OK);
    }

}
