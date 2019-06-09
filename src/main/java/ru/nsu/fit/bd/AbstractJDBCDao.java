package ru.nsu.fit.bd;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Transactional
@Repository
public abstract class AbstractJDBCDao<T extends Entity, PK extends Serializable> implements InterfaceDao<T, PK> {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public abstract String getSelectQuery();

    protected abstract String getPKQuery();

    protected abstract void prepareStatementForGetByPK(PreparedStatement statement, PK primaryKey) throws SQLException;

    protected abstract List<T> parseResultSet(ResultSet rs) throws SQLException;

    @Override
    public List<T>  get(PK primaryKey) throws Exception {
        List<T> list;
        String sql = getPKQuery();
        try (PreparedStatement statement = jdbcTemplate.getDataSource().getConnection().prepareStatement( sql )) {
            prepareStatementForGetByPK( statement, primaryKey );
            ResultSet rs = statement.executeQuery();
            list = parseResultSet( rs );
        } catch (Exception e) {
            throw new Exception( e );
        }
        if (list == null || list.size() == 0) {
            return null;
        }
        return list;
    }

    @Override
    public List<T> getAll() throws Exception {
        List<T> list;
        String sql = getSelectQuery();
        try (PreparedStatement statement = jdbcTemplate.getDataSource().getConnection().prepareStatement( sql )) {
            ResultSet rs = statement.executeQuery();
            list = parseResultSet( rs );
        } catch (Exception e) {
            throw new Exception( e );
        }
        return list;
    }

}
