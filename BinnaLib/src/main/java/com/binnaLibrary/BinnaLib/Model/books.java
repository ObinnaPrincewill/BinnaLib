package com.binnaLibrary.BinnaLib.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class books {

    @Id
    private int id;
    private String title;
    private String genre;
    private String author;
    private int quantity;
    private boolean available;


}
