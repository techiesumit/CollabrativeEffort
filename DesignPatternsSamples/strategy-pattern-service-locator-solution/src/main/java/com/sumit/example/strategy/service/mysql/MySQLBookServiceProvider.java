package com.sumit.example.strategy.service.mysql;

import com.sumit.example.strategy.service.BookService;
import com.sumit.example.strategy.service.BookServiceProvider;

public class MySQLBookServiceProvider implements BookServiceProvider {
    @Override
    public BookService getBookServices() {
        return new MySQLBookService();
    }
}
