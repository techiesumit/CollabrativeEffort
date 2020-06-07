package org.sumit.strategy.dynamic.proxy.provider.mongo;


import org.sumit.strategy.dynamic.proxy.service.BookService;
import org.sumit.strategy.dynamic.proxy.service.BookServiceProvider;

public class MongoServiceProvider implements BookServiceProvider {
    @Override
    public BookService getProvider(String provider) {
        return new MongoBookService();
    }
}
