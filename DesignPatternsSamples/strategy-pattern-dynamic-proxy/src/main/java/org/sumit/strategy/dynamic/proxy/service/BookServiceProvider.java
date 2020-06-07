package org.sumit.strategy.dynamic.proxy.service;

import java.lang.reflect.InvocationHandler;

public interface BookServiceProvider extends InvocationHandler
{
    public BookService getProvider(String  provider);
}
