package base.service;

import base.domain.baseDomain.BaseClassifier;
import base.domain.baseDomain.rowMappers.BaseClassifierRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by Satenik.Gevorgyan on 8/25/2015.
 */
public class BaseClassifierDaoImpl implements BaseClassifierDao {
    private JdbcTemplate jdbcTemplate;

    public BaseClassifierDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<BaseClassifier> getStatuses() {
        String query = "SELECT * FROM C_Status";
        return jdbcTemplate.query(query, new BaseClassifierRowMapper());
    }

    public List<BaseClassifier> getUsageStatuses() {
        String query = "SELECT * FROM C_Usage_Status";
        return jdbcTemplate.query(query, new BaseClassifierRowMapper());
    }

    public List<BaseClassifier> getCounties() {
        String query = "SELECT * FROM C_Country";
        return jdbcTemplate.query(query, new BaseClassifierRowMapper());
    }

    public List<BaseClassifier> getBrands() {
        String query = "SELECT * FROM C_Brand";
        return jdbcTemplate.query(query, new BaseClassifierRowMapper());
    }

    public List<BaseClassifier> getCategories() {
        String query = "SELECT * FROM C_Category";
        return jdbcTemplate.query(query, new BaseClassifierRowMapper());
    }

    public List<BaseClassifier> getRoles() {
        String query = "SELECT * FROM C_Role";
        return jdbcTemplate.query(query, new BaseClassifierRowMapper());
    }

}
