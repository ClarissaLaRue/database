package ru.nsu.fit.bd.Dao;

import org.springframework.stereotype.Repository;
import ru.nsu.fit.bd.model.Teachers;

import javax.transaction.Transactional;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Transactional
@Repository
public class TeachersDao extends AbstractJDBCDao<Teachers, String>{
    @Override
    public String getSelectQuery() {
        return null;
    }

    @Override
    protected String getPKQuery() {
        return null;
    }

    @Override
    protected void prepareStatementForGetByPK(PreparedStatement statement, String primaryKey) throws SQLException {

    }

    @Override
    protected List<Teachers> parseResultSet(ResultSet rs) throws SQLException {
        return null;
    }
}
