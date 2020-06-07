package com.sumit.example.strategy.service;

import com.sumit.example.strategy.service.factory.BookServiceProvider;

public class MySQLBookServiceProvider implements BookServiceProvider {

    @Override
    public BookService getProvider(String provider) {
        return new MySQLBookService();
    }
}
