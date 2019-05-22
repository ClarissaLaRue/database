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
public abstract class AbstractJDBCDao<T extends Entity> implements InterfaceDao<T> {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public abstract String getSelectQuery();

    public abstract String getCreateQuery();

    public abstract String getUpdateQuery();

    public abstract String getDeleteQuery();

    protected abstract String getIdComparisionStatementPart();

    protected abstract void prepareStatementForGetByPK(PreparedStatement statement, T obj) throws SQLException;

    protected abstract void prepareStatementForUpdate(PreparedStatement statement, T obj) throws SQLException;

    protected abstract void prepareStatementForInsert(PreparedStatement statement, T obj) throws SQLException;

    protected abstract void prepareStatementForDelete(PreparedStatement statement, T obj) throws SQLException;

    protected abstract List<T> parseResultSet(ResultSet rs) throws SQLException;

    @Override
    public T getByPK(T primaryKey) throws Exception {
        List<T> list;
        String sql = getSelectQuery();
        sql += getIdComparisionStatementPart();
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
        if (list.size() > 1) {
            throw new Exception( "Received more than one record." );
        }
        return list.iterator().next();
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

    @Override
    public void update(T obj) throws Exception {
        String sql = getUpdateQuery();

        try (PreparedStatement statement = jdbcTemplate.getDataSource().getConnection().prepareStatement( sql )) {
            prepareStatementForUpdate( statement, obj );
            int count = statement.executeUpdate();
            if (count != 1) {
                throw new Exception( "On update modify more then 1 record: " + count );
            }
        } catch (Exception e) {
            throw new Exception( e );
        }
    }

    @Override
    public void delete(T primaryKey) throws Exception {
        String sql = getDeleteQuery();
        try (PreparedStatement statement = jdbcTemplate.getDataSource().getConnection().prepareStatement( sql )) {
            prepareStatementForDelete( statement,  primaryKey);
            int count = statement.executeUpdate();
            if (count != 1) {
                throw new Exception( "On delete modify more then 1 record: " + count );
            }
        } catch (Exception e) {
            throw new Exception( e );
        }
    }

    @Override
    public T create(T object) throws Exception {
        T persistInstance;

        String sql = getCreateQuery();
        try (PreparedStatement statement = jdbcTemplate.getDataSource().getConnection().prepareStatement( sql )) {
            prepareStatementForInsert( statement, object );
            int count = statement.executeUpdate();
            if (count != 1) {
                throw new Exception( "On create modify more then 1 record: " + count );
            }
        } catch (Exception e) {
            throw new Exception( e );
        }

        sql = getSelectQuery() + "WHERE id = last_insert_id();";
        try (PreparedStatement statement = jdbcTemplate.getDataSource().getConnection().prepareStatement( sql )) {
            ResultSet rs = statement.executeQuery();
            List<T> list = parseResultSet( rs );
            if ((list == null) || (list.size() != 1)) {
                throw new Exception( "Exception on findByPK new create dao." );
            }
            persistInstance = list.iterator().next();
        } catch (Exception e) {
            throw new Exception( e );
        }
        return persistInstance;
    }

}
