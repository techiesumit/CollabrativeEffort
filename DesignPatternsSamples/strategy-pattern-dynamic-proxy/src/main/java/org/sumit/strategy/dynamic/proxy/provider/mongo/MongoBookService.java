/**
 * 
 */
package org.sumit.strategy.dynamic.proxy.provider.mongo;


import org.sumit.strategy.dynamic.proxy.model.Book;
import org.sumit.strategy.dynamic.proxy.service.BookService;

import java.util.List;

/**
 * @author Sumit
 *
 */
public class MongoBookService implements BookService {

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
		return com.sumit.example.strategy.service.data.BookMockData.getBookByID(bookId);
		/*return (new ArrayList<Book>()
				.add(new Book("B0001","Java Helpful Examples","Sumit Chawla & Kapil Kumar", "2020")));*/ // This expression is returning boolean WHY??????
	}

}
