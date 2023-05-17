package com.itec1api.biblioteca.repositories;

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
        Book book01 = new Book("", "", "", 123);
        Book book02 = new Book("", "", "", 123);
        Book book03 = new Book("", "", "", 123);
        Book book04 = new Book("", "", "", 123);
        Book book05 = new Book("", "", "", 123);
        Book book06 = new Book("", "", "", 123);
        Book book07 = new Book("", "", "", 123);
        Book book08 = new Book("", "", "", 123);
        Book book09 = new Book("", "", "", 123);
        Book book10 = new Book("", "", "", 123);

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
            book.setEditorial(bookToUpdate.getEditorial());
            book.setPublishedYear(bookToUpdate.getPublishedYear());
            return book;
        }

        return null;
    }

    public Book deleteByName(String name) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                books.remove(book);
                return book;
            }
        }
        return null; // si no se encuentra el libro, se retorna null
    }

}
