package com.synisys.spring.project.service.Implementation;

import com.synisys.spring.project.service.Service;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author vahe.marikyan
 * @since 2/13/2016.
 */
public abstract class AbstractService<T> implements Service<T> {

    protected JdbcTemplate jdbcTemplate;

    public AbstractService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
