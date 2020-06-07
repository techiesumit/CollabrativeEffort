package org.sumit.strategy.dynamic.proxy.mock;

import org.sumit.strategy.dynamic.proxy.model.Book;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookMockData {
   private static List<Book> bookData;
    static{
        Book data1= new Book("B0001","Java Helpful Examples","Sumit Chawla & Kapil Kumar", "2017");
        Book data2= new Book("B0011","Java Helpful Examples 1.1","Sumit Chawla & Kapil Kumar", "2017");
        Book data3= new Book("B0111","Advance Java Helpful Examples","Sumit Chawla & Kapil Kumar", "2020");
        Book data4= new Book("B0002","More Advande Java Helpful Examples","Sumit Chawla & Kapil Kumar", "2019");
        Book data5= new Book("B0022","Modern Java Helpful Examples","Sumit Chawla & Kapil Kumar", "2016");
        Book data6= new Book("B0003","Modern Java Helpful Examples 2.0","Sumit Chawla & Kapil Kumar", "2020");
        Book data7= new Book("B0033","Handful Advance Java Helpful Examples","Sumit Chawla & Kapil Kumar", "2018");
        Book data8= new Book("B0004","Design Pattern Advance Java Helpful Examples","Sumit Chawla & Kapil Kumar", "2015");
        bookData.add(data1);bookData.add(data2);bookData.add(data3);bookData.add(data4);bookData.add(data5);bookData.add(data6);bookData.add(data7);bookData.add(data8);
    }

    public static List<Book> getBookByID(String id){
       return bookData.stream().filter(ISBNPredicate(id)).collect(Collectors.toList());
    }

    private static Predicate<Book> ISBNPredicate(String isbn){
    return b->b.getIsbn().equalsIgnoreCase(isbn);
    }
}
