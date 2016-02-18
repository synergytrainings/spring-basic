package com.synisys.spring.project.domain;

import com.synisys.spring.project.entities.EntityImpl;

/**
 * @author vahe.marikyan
 * @since 2/13/2016.
 */
public class Book extends EntityImpl {

    private String title;

    private String author;



    public Book(Integer id) {
        super(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
