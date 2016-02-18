package com.synisys.spring.project.domain;

import java.util.List;

/**
 * @author vahe.marikyan
 * @since 2/13/2016.
 */
public class Library {

    private List<Book> allBooks;

    private List<Reader> allReaders;

    private String address;


    public List<Book> getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(List<Book> allBooks) {
        this.allBooks = allBooks;
    }

    public List<Reader> getAllReaders() {
        return allReaders;
    }

    public void setAllReaders(List<Reader> allReaders) {
        this.allReaders = allReaders;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
