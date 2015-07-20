package com.synisys.spring.project.helper;

import com.synisys.spring.project.domain.Contact;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Author : Siranush Avetisyan
 * Since : 10/7/2015
 */
public class ContactMapper implements RowMapper<Contact> {
    public Contact mapRow(ResultSet row, int rowNum) throws SQLException {
        Contact contact = new Contact(row.getInt("ContactID"));
        contact.setEmail(row.getString("Email"));
        contact.setNumber(row.getString("Number"));
        return contact;
    }
}
