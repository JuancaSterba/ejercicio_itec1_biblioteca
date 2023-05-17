package com.itec1api.biblioteca.DTO.request;

import lombok.*;

import java.time.LocalDate;

@Data
public class BookLoanRequestDTO {
    private String loanDate;
    private String devolutionDate;
    private BookStateRequestDTO bookStateRequestDTO;
    private PartnerRequestDTO partnerRequestDTO;
    private BookCopyRequestDTO bookCopyRequestDTO;
}
