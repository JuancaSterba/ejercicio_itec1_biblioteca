package com.itec1api.biblioteca.DTO.request;


import lombok.*;

@Data
public class PartnerRequestDTO {
    private Integer partNumber;
    private Integer dni;
    private String name;
    private String lastName;
}
