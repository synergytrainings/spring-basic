package base.service;

        import base.domain.baseDomain.BaseItem;
        import base.domain.baseDomain.rowMappers.BaseItemRowMapper;
        import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Satenik.Gevorgyan on 8/3/2015.
 */
public class BaseDaoImpl implements BaseDao{

    private JdbcTemplate daoObject;

    public BaseDaoImpl(JdbcTemplate daoObject) {
        this.daoObject = daoObject;
    }

    public void createItem(BaseItem item) {
        String query = ""; // TODO add insert query
        daoObject.update(query, item.getItemName(), item.getCategory());
    }

    public BaseItem getItem(Integer id) {
        String query = "";//TODO add select query
        return daoObject.queryForObject(query, new Object[]{id}, new BaseItemRowMapper());
    }
}
