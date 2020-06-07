package com.sumit.example.strategy.service;

import java.util.List;

public interface BookServiceProvider
{
    public BookService getProvider(String  provider);
}
