package com.itec1api.biblioteca.DTO.response;

import com.itec1api.biblioteca.entities.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BookCopy {
    private Integer copyNumber;
    private Book book;
}
