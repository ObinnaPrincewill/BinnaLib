package com.binnaLibrary.BinnaLib.Service;

import com.binnaLibrary.BinnaLib.Model.books;
import com.binnaLibrary.BinnaLib.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    @Autowired
    private BookRepo repos;


    public List<books> allBooks() {
        return repos.findAll();
    }

    public List<books> getByGenre(String genre) {
        return repos.findByGenre(genre);
    }

    public List<books> getByAuthor(String author) {
        return repos.findByAuthor(author);
    }

    public List<books> getByTitle(String title) {
        return repos.findByTitle(title);
    }
    public Page<books> getBooks(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return repos.findAll(pageable);
    }
}
