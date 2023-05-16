package com.itec1api.biblioteca.DTO;

import com.itec1api.biblioteca.entities.Author;
import com.itec1api.biblioteca.entities.Book;
import lombok.Data;

import javax.persistence.Column;

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
        authorResponseDTO.setNationality(author.getNationality());
        authorResponseDTO.setDescription(author.getDescription());
        return authorResponseDTO;
    }

    public Author fromDTO(AuthorRequestDTO authorRequestDTO){
        Author author = new Author();
        author.setName(author.getName());
        author.setLastName(author.getLastName());
        author.setNationality(author.getNationality());
        author.setDescription(author.getDescription());
        return author;
    }
}
