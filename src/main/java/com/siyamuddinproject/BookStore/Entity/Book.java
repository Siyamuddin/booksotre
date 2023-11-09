package com.siyamuddinproject.BookStore.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "bookdetails")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String bookName;
    private String bookAuthor;
    private String bookReleaseDate;
    private String bookType;
    private String bookDescription;
    private double bookPrice;
    private int bookAvailable;
    @CreationTimestamp
    private LocalDateTime timeCreated;
    @UpdateTimestamp
    private LocalDateTime lastUpdated;

}
