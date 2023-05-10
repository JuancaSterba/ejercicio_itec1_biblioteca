package com.itec1api.biblioteca.controllers;

import com.itec1api.biblioteca.DTO.BookResponseDTO;
import com.itec1api.biblioteca.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libraries/books")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public ResponseEntity<List<BookResponseDTO>> getAll() {
//        List<BookResponseDTO> responseDTOS = bookService.findAll();
//        return new ResponseEntity<>(responseDTOS, HttpStatus.OK);
//    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ResponseEntity<List<BookResponseDTO>> getOne(@PathVariable String name) {
        List<BookResponseDTO> responseDTOS = bookService.findByName(name);
        return new ResponseEntity<>(responseDTOS, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<Object> save() {
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> update(@PathVariable Long id) { return null; }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable Long id) { return null; }

}
