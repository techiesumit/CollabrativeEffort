package org.sumit.strategy.dynamic.proxy.provider.mysql;

import org.sumit.strategy.dynamic.proxy.service.BookService;
import org.sumit.strategy.dynamic.proxy.service.BookServiceProvider;

public class MySQLBookServiceProvider implements BookServiceProvider {

    @Override
    public BookService getProvider(String provider) {
            return new MySQLBookService();
    }
}
