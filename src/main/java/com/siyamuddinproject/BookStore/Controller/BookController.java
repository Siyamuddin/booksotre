package com.siyamuddinproject.BookStore.Controller;

import com.siyamuddinproject.BookStore.Entity.Book;
import com.siyamuddinproject.BookStore.Responses.BookResponse;
import com.siyamuddinproject.BookStore.Service.ImplementService.BookServiceImplemantation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {
    BookServiceImplemantation bookServiceImplemantation;

    public BookController(BookServiceImplemantation bookServiceImplemantation) {
        this.bookServiceImplemantation = bookServiceImplemantation;
    }
    @PostMapping("/add")
    public String createBook(@RequestBody Book book)
    {
        bookServiceImplemantation.createBook(book);
        return "Success";
    }
    @PutMapping("/edit")
    public String updateBook(@RequestBody Book book)
    {
        bookServiceImplemantation.updateBook(book);
        return "Success";
    }
    @GetMapping("{id}")
    public ResponseEntity<Object> getBook(@PathVariable("id") Long id)
    {
       return BookResponse.responseBuilder("Found the book", HttpStatus.OK, bookServiceImplemantation.getBook(id));
    }
    @GetMapping("/all")
    public List<Book> getAllBook()
    {
        return bookServiceImplemantation.getAllBook();
    }
    @DeleteMapping({"id"})
    public String deleteBook(@PathVariable("id") Long id)
    {
        bookServiceImplemantation.deleteBook(id);
         return "Success";
    }

}
