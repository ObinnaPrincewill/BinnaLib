package com.binnaLibrary.BinnaLib.Controller;

import com.binnaLibrary.BinnaLib.Model.books;
import com.binnaLibrary.BinnaLib.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private BookService service;

    @GetMapping("/")
    public String home(){
        return "Welcome to Obinna's Library";
    }

    @GetMapping("/books")
    public List<books> allBooks(){
        return service.allBooks();
    }
    @GetMapping("/booksbyGenre/{genre}")
    public List<books> getByGenre(@PathVariable String genre){
        return service.getByGenre(genre);
    }
    @GetMapping("/booksbySAuthor/{author}")
    public List<books> getByAuthor(@PathVariable String author){
        return service.getByAuthor(author);
    }
    @GetMapping("/booksbyTitle/{title}")
    public List<books> getByTitle(@PathVariable String title){
        return service.getByTitle(title);
    }
    @GetMapping("/books/{page}/{size}")
    public Page<books> getBookByPage(@PathVariable int page,@PathVariable int size){
        return service.getBooks(page, size);
    }
}
