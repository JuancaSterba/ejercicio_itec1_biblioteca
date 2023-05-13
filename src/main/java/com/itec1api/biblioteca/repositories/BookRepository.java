package com.itec1api.biblioteca.repositories;

import com.itec1api.biblioteca.DTO.BookRequestDTO;
import com.itec1api.biblioteca.DTO.BookResponseDTO;
import com.itec1api.biblioteca.entities.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class BookRepository {
    private List<Book> books;

    public BookRepository() {
        init();
    }

    public void init() {

        this.books = new ArrayList<>();
        Book book01 = new Book("Libro 1", "Autor 1","Editorial 1",2015, "genero 1");
        Book book02 = new Book("Libro 2", "Autor 2","Editorial 2",2015, "genero 2");
        Book book03 = new Book("Libro 3", "Autor 3","Editorial 3",2015, "genero 3");
        Book book04 = new Book("Libro 4", "Autor 4","Editorial 1",2015, "genero 4");
        Book book05 = new Book("Libro 5", "Autor 1","Editorial 2",2015, "genero 5");
        Book book06 = new Book("Libro 6", "Autor 2","Editorial 3",2015, "genero 1");
        Book book07 = new Book("Libro 7", "Autor 3","Editorial 1",2015, "genero 2");
        Book book08 = new Book("Libro 8", "Autor 4","Editorial 2",2015, "genero 3");
        Book book09 = new Book("Libro 9", "Autor 1","Editorial 3",2015, "genero 4");
        Book book10 = new Book("Libro 10", "Autor 2","Editorial 1",2015, "genero 5");

        books.add(book01);
        books.add(book02);
        books.add(book03);
        books.add(book04);
        books.add(book05);
        books.add(book06);
        books.add(book07);
        books.add(book08);
        books.add(book09);
        books.add(book10);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void save(Book book) {
        books.add(book);
    }

    public List<Book> findByName(String nameToSearch) {
        return books.stream()
                .filter(b -> b.getName().contains(nameToSearch))
                .collect(Collectors.toList());
    }

    public Book update(Book bookToUpdate) {
        Optional<Book> bookOptional = books.stream()
                .filter(book -> book.getName().equals(bookToUpdate.getName()))
                .findFirst();

        if (bookOptional.isPresent()) {
            Book book = bookOptional.get();
            book.setAuthor(bookToUpdate.getAuthor());
            book.setEditorial(bookToUpdate.getEditorial());
            book.setPublishedYear(bookToUpdate.getPublishedYear());
            book.setGenre(bookToUpdate.getGenre());
            return book;
        }

        return null;
    }

    public void delete(Book bookToDelete) {

    }
}
