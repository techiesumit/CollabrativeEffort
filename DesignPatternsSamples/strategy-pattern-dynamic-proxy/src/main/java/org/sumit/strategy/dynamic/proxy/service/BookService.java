package org.sumit.strategy.dynamic.proxy.service;

import org.sumit.strategy.dynamic.proxy.model.Book;

import java.util.List;

public interface BookService {
    public void addBook(Book book);
    public void updateBook(Book book);
    public List<Book> getBookById(String bookId);
}
