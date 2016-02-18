package com.synisys.spring.project.service.Implementation;


import com.synisys.spring.project.domain.Reader;
import com.synisys.spring.project.service.ReaderService;
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
public class ReaderServiceImpl extends AbstractService<Reader> implements ReaderService {

    public ReaderServiceImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public void save(Reader element) {
        String query = "Insert into Readers (CardNumber, RegistrationDate) VALUES (?, ?)";

        jdbcTemplate.update(query, element.getCardNumber(), element.getRegistrationDate());
    }

    @Override
    public void update(Reader element) {
        String query = "UPDATE Readers SET CardNumber = ?, RegistrationDate = ? WHERE ReaderID = ?";

        jdbcTemplate.update(query, element.getCardNumber(), element.getRegistrationDate(), element.getId());
    }

    @Override
    public void delete(Reader element) {
        String query = "";
        HashMap map = new HashMap();
        map.put("ReaderID", element.getId());

        jdbcTemplate.update(query, map);
    }

    @Override
    public List<Reader> loadAll() {
        String query = "";

        return jdbcTemplate.query(query, new RowMapper<Reader>() {
            @Override
            public Reader mapRow(ResultSet row, int i) throws SQLException {
                Reader reader = new Reader(row.getInt("ReaderID"));
                reader.setCardNumber(row.getString("CardNumber"));
                reader.setRegistrationDate(row.getDate("RegistrationDate"));

                return reader;
            }
        });
    }

    @Override
    public Reader loadReaderByCardNumber(String cardNumber) {
        String query = "";

        return jdbcTemplate.queryForObject(query, new Object[]{cardNumber}, new RowMapper<Reader>() {
            @Override
            public Reader mapRow(ResultSet row, int i) throws SQLException {
                Reader reader = new Reader(row.getInt("ReaderID"));
                reader.setCardNumber(row.getString("CardNumber"));
                reader.setRegistrationDate(row.getDate("RegistrationDate"));

                return reader;
            }
        });
    }
}
