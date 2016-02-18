package com.synisys.spring.project.service;

import com.synisys.spring.project.domain.Book;
import com.synisys.spring.project.domain.BookReader;

/**
 * @author vahe.marikyan
 * @since 2/13/2016.
 */
public interface BookReaderService extends Service<BookReader> {

    BookReader loadBookReaderByBookTitle(Book book);

}
