package com.sumit.example.strategy.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Book {

    private String isbn;
    private String bookName;
    private String author;
    private String yearReleased;
}
