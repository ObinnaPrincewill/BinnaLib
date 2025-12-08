package com.binnaLibrary.BinnaLib.Repository;

import com.binnaLibrary.BinnaLib.Model.books;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepo extends JpaRepository<books, Integer>,
        PagingAndSortingRepository<books, Integer> {
    Page<books> findByGenre(String genre, Pageable pageable);
    List<books> findByAuthor(String author);
    List<books> findByGenre(String genre);
    List<books> findByTitle(String title);
}
