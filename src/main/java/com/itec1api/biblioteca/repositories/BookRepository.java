package com.itec1api.biblioteca.repositories;

import com.itec1api.biblioteca.entities.Author;
import com.itec1api.biblioteca.entities.Book;
import com.itec1api.biblioteca.entities.Genre;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {
    private List<Book> books;

    public BookRepository() {
        init();
    }

    public void init() {
        Author author01 = new Author("JK Rowlin","British", LocalDate.now());
        Genre genre01 = new Genre("Comedy");
        Genre genre02 = new Genre("Drama");
        Genre genre03= new Genre("Thriller");
        this.books = new ArrayList<>();
        Book book01 = new Book("Libro 1", genre01,"De bolsillo",2015, author01 );
        Book book02 = new Book("Libro 2", genre02,"De bolsillo",2015, author01 );
        Book book03 = new Book("Libro 3", genre03,"De bolsillo",2015, author01 );
        Book book04 = new Book("Libro 4", genre01,"De bolsillo",2015, author01 );
        Book book05 = new Book("Libro 5", genre02,"De bolsillo",2015, author01 );
        Book book06 = new Book("Libro 6", genre03,"De bolsillo",2015, author01 );
        Book book07 = new Book("Libro 7", genre01,"De bolsillo",2015, author01 );
        Book book08 = new Book("Libro 8", genre02,"De bolsillo",2015, author01 );
        Book book09 = new Book("Libro 9", genre03,"De bolsillo",2015, author01 );
        Book book10 = new Book("Libro 10", genre01,"De bolsillo",2015, author01 );

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
}
