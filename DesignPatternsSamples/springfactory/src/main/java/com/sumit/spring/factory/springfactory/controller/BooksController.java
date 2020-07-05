package com.sumit.spring.factory.springfactory.controller;

import com.sumit.spring.factory.springfactory.dataoperation.factory.DataFactory;
import com.sumit.spring.factory.springfactory.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/books")
public class BooksController {
    @Autowired
    DataFactory factory;
    @PostMapping("/book")
    void saveBook(@RequestBody Books books){

    }
}
