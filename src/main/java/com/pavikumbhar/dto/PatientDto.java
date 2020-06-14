package com.pavikumbhar.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PatientDto {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
}