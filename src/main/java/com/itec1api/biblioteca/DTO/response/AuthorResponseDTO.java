package com.itec1api.biblioteca.DTO.response;

import com.itec1api.biblioteca.DTO.request.AuthorRequestDTO;
import com.itec1api.biblioteca.entities.Author;
import lombok.Data;

@Data
public class AuthorResponseDTO {

    private String name;
    private String lastName;
    private String nationality;
    private String description;

    public AuthorResponseDTO toDTO(Author author){
        AuthorResponseDTO authorResponseDTO = new AuthorResponseDTO();
        authorResponseDTO.setName(author.getName());
        authorResponseDTO.setLastName(author.getLastName());
        return authorResponseDTO;
    }

    public Author fromDTO(AuthorRequestDTO authorRequestDTO){
        Author author = new Author();
        author.setName(author.getName());
        author.setLastName(author.getLastName());
        return author;
    }
}
