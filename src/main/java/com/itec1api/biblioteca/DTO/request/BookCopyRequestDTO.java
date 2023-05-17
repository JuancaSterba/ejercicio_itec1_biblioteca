package com.itec1api.biblioteca.DTO.request;

import lombok.*;

@Data
public class BookCopyRequestDTO {
    private Integer copyNumber;
    private BookRequestDTO bookRequestDTO;
}
