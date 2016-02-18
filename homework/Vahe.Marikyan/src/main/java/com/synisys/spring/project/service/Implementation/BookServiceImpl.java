package com.synisys.spring.project.service.Implementation;

import com.synisys.spring.project.domain.Book;
import com.synisys.spring.project.service.BookService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 * @author vahe.marikyan
 * @since 2/13/2016.
 */
public class BookServiceImpl extends AbstractService<Book> implements BookService {

    public BookServiceImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public void save(Book element) {
        String query = "Insert into Books (Title, Author) VALUES (?, ?)";

        /*HashMap map = new HashMap();
        map.put("Author", element.getAuthor());
        map.put("Title", element.getTitle());
        */

        jdbcTemplate.update(query, element.getAuthor(), element.getTitle());
    }

    @Override
    public void update(Book element) {
        String query = "UPDATE Books SET Author = ?, Title = ? WHERE BookID = ?";

        jdbcTemplate.update(query, element.getAuthor(), element.getTitle(), element.getId());
    }

    @Override
    public void delete(Book element) {
        String query = "";
        HashMap map = new HashMap();
        map.put("BookID", element.getId());

        jdbcTemplate.update(query, map);
    }

    @Override
    public List<Book> loadAll() {
        String query = "";

        return jdbcTemplate.query(query, new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet row, int i) throws SQLException {
                Book book = new Book(row.getInt("BookID"));
                book.setAuthor(row.getString("Author"));
                book.setTitle(row.getString("Title"));

                return book;
            }
        });
    }


    @Override
    public Book loadBookByTitle(String title) {
        String query = "";

        return jdbcTemplate.queryForObject(query, new Object[]{title}, new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet row, int i) throws SQLException {
                Book book = new Book(row.getInt("BookID"));
                book.setAuthor(row.getString("Author"));
                book.setTitle(row.getString("Title"));

                return book;
            }
        });
    }
}
