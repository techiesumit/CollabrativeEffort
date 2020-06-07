package com.sumit.example.strategy.service;

import java.util.List;
import java.util.ServiceLoader;
import java.util.function.Predicate;

public class BookServiceFactory implements BookServiceProvider {

    private static ServiceLoader<BookService> serviceProviders;
    static{
        serviceProviders = ServiceLoader.load(BookService.class).forEach();
    }
    @Override
    public BookService getProvider(String  provider) {
        //?? how to implement this , best possible manner.
        return serviceProviders.stream().filter(getInstanceOf(provider)).findFirst();
    }
    private Predicate<BookServiceProvider> getInstanceOf(String providerType){
        return sp->sp.
    }
}
