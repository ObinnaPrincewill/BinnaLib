package com.binnaLibrary.BinnaLib.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "books")
public class books {

    @Id
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "genre")
    private String genre;
    @Column(name = "author")
    private String author;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "available")
    private boolean available;

    public books() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitle() {
        return title;
    }

    public void setBookTitle(String bookTitle) {
        this.title = bookTitle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public books(int id, String bookTitle, String genre, String author, int quantity, boolean available) {
        this.id = id;
        this.title = bookTitle;
        this.genre = genre;
        this.author = author;
        this.quantity = quantity;
        this.available = available;
    }
}
