package com.synisys.spring.project.service.Implementation;

import com.synisys.spring.project.domain.Book;
import com.synisys.spring.project.domain.BookReader;
import com.synisys.spring.project.service.BookReaderService;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author vahe.marikyan
 * @since 2/13/2016.
 */
public class BookReaderServiceImpl extends AbstractService<BookReader> implements BookReaderService {

    public BookReaderServiceImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public void save(BookReader element) {

    }

    @Override
    public void update(BookReader element) {

    }

    @Override
    public void delete(BookReader element) {

    }

    @Override
    public List<BookReader> loadAll() {
        return null;
    }

    @Override
    public BookReader loadBookReaderByBookTitle(Book book) {
        return null;
    }
}
