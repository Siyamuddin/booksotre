package com.siyamuddinproject.BookStore.Service;

import com.siyamuddinproject.BookStore.Entity.Book;

import java.util.List;

public interface BookService {
    public void createBook(Book book);
    public void updateBook(Book book);
    public Book getBook(Long id);
    public List<Book> getAllBook();
    public void deleteBook(Long id);

}
