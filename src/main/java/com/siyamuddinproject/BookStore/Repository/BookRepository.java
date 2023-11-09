package com.siyamuddinproject.BookStore.Repository;

import com.siyamuddinproject.BookStore.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
