package com.sumit.example.strategy.service.factory;

import com.sumit.example.strategy.service.BookService;

import java.util.List;

public interface BookServiceProvider
{
    public BookService getProvider();
}
