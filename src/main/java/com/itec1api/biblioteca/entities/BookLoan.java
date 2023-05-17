package com.itec1api.biblioteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BookLoan {
    private LocalDate loanDate;
    private LocalDate devolutionDate;
    private BookState bookState;
    private Partner partner;
    private BookCopy copie;
}
