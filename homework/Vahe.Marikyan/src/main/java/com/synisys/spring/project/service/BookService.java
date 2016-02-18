package com.synisys.spring.project.service;

import com.synisys.spring.project.domain.Book;

/**
 * @author vahe.marikyan
 * @since 2/13/2016.
 */
public interface BookService extends Service<Book> {

    Book loadBookByTitle(String title);

}
