package com.itec1api.biblioteca.DTO.request;

import lombok.*;

import java.util.List;

@Data
public class BookRequestDTO {

    private String isbn;
    private String name;
    private List<AuthorRequestDTO> authorsRequestDTOS;
    private String editorial;
    private Integer publishedYear;
    private List<GenreRequestDTO> genresRequestDTOS;
    private List<BookCopyRequestDTO> copiesRequestDTOS;

}
