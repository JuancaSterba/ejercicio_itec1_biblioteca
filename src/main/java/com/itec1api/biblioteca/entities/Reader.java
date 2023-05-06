package com.itec1api.biblioteca.entities;

import java.time.LocalDate;

public class Reader extends BaseEntity {
    private Integer bookLent;
    private LocalDate penalty;
    private BookCopy bookCopy;
}
