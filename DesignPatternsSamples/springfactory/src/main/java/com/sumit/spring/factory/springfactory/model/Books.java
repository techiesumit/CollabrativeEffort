package com.sumit.spring.factory.springfactory.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Books {
    private String bookName;
    private String isbn;
    private String firstEditionYear;
}
