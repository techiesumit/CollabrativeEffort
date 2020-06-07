package com.sumit.example.strategy.service.mongodb;

import com.sumit.example.strategy.service.BookService;
import com.sumit.example.strategy.service.BookServiceProvider;
import com.sumit.example.strategy.service.mongodb.MongoBookService;

public class MongoServiceProvider implements BookServiceProvider {
    @Override
    public BookService getProvider(String provider) {
        return new MongoBookService();
    }
}
