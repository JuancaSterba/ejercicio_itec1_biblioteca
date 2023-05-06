package com.itec1api.biblioteca.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libraries")
public class LibraryController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<Object> getAll() {
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getOne(@PathVariable Long id) {
        return null;
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
