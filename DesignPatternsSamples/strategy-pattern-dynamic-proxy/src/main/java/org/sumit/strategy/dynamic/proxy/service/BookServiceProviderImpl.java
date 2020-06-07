package org.sumit.strategy.dynamic.proxy.service;

import java.lang.reflect.Method;

public class BookServiceProviderImpl implements BookServiceProvider{
    @Override
    public BookService getProvider(String provider) {
        return null;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
