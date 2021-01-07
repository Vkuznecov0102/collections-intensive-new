package ru.itsjava.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Man {
    private final String name;
    private final String surname;
}