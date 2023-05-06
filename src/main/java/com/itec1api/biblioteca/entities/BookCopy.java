package com.itec1api.biblioteca.entities;

import java.time.LocalDate;

public class BookCopy extends BaseEntity {
    private Integer state;
    private LocalDate loanDate;
    private Book book;
}
