package org.sumit.strategy.dynamic.proxy.provider.mysql;

import org.sumit.strategy.dynamic.proxy.model.Book;
import org.sumit.strategy.dynamic.proxy.service.BookService;

import java.util.List;

import static org.sumit.strategy.dynamic.proxy.mock.BookMockData.getBookByID;

public class MySQLBookService implements BookService {
    @Override
    public void addBook(Book book) {
        System.out.println("Addng Book in Mongo DB");
    }

    @Override
    public void updateBook(Book book) {
        System.out.println("Updating Book in MongoDB");

    }

    @Override
    public List<Book> getBookById(String bookId) {
        return getBookByID(bookId);
		/*return (new ArrayList<Book>()
				.add(new Book("B0001","Java Helpful Examples","Sumit Chawla & Kapil Kumar", "2020")));*/ // This expression is returning boolean WHY??????
    }
}
