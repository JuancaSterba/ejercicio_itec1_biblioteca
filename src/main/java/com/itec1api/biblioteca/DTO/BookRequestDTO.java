package com.itec1api.biblioteca.DTO;

import lombok.Data;

@Data
public class BookRequestDTO {

    private String name;
    private String genre;
    private String editorial;
    private Integer publishedYear;

}
