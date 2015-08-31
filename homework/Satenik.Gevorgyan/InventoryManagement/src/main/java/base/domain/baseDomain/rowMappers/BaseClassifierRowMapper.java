package base.domain.baseDomain.rowMappers;

import base.domain.baseDomain.BaseClassifier;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Satenik.Gevorgyan on 8/25/2015.
 */
public class BaseClassifierRowMapper implements RowMapper<BaseClassifier> {

    public BaseClassifier mapRow(ResultSet row, int rowNum) throws SQLException {
        BaseClassifier classifier = new BaseClassifier();
        classifier.setId(row.getInt("ID"));
        classifier.setName(row.getString("NAME"));
        classifier.setDescription(row.getString("Description"));
        return classifier;
    }
}

