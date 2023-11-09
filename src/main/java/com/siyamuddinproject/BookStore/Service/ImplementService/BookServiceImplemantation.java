package com.siyamuddinproject.BookStore.Service.ImplementService;

import com.siyamuddinproject.BookStore.Entity.Book;
import com.siyamuddinproject.BookStore.Exception.BookNotFoundException;
import com.siyamuddinproject.BookStore.Repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImplemantation {
    BookRepository bookRepository;

    public BookServiceImplemantation(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void createBook(Book book){
        bookRepository.save(book);
    }
    public void updateBook(Book book){
        bookRepository.save(book);
    }
    public Book getBook(Long id){
        if(bookRepository.findById(id).isEmpty())
        {
            throw new BookNotFoundException("This book is currently not available");
        }
        return bookRepository.findById(id).get();
    }
    public List<Book> getAllBook(){
        return bookRepository.findAll();
    }
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
}
