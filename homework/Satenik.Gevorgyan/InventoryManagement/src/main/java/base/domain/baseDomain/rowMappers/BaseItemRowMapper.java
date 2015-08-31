package base.domain.baseDomain.rowMappers;

import base.domain.baseDomain.BaseClassifier;
import base.domain.baseDomain.BaseItem;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Satenik.Gevorgyan on 8/25/2015.
 */
public class BaseItemRowMapper implements RowMapper<BaseItem> {

    public BaseItem mapRow(ResultSet row, int rowNum) throws SQLException {
        BaseItem item = new BaseItem();

        return item;
    }
}