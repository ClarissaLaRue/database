package ru.nsu.fit.bd;

import org.springframework.stereotype.Repository;
import ru.nsu.fit.bd.model.Faculties;
import ru.nsu.fit.bd.model.Universities;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class FacultiesDao extends AbstractJDBCDao<Faculties, Integer> {
    @Override
    public String getSelectQuery() {
        return "SELECT * FROM FACULTIES ";
    }

    @Override
    public String getCreateQuery() {
        return null;
    }

    @Override
    public String getUpdateQuery() {
        return null;
    }

    @Override
    public String getDeleteQuery() {
        return null;
    }

    @Override
    protected String getIdComparisionStatementPart() {
        return "WHERE UniversityID = ?";
    }

    @Override
    protected void prepareStatementForGetByPK(PreparedStatement statement, Integer primaryKey) throws SQLException {
        statement.setInt(1, primaryKey);
    }

    @Override
    protected void prepareStatementForUpdate(PreparedStatement statement, Faculties obj) throws SQLException {

    }

    @Override
    protected void prepareStatementForInsert(PreparedStatement statement, Faculties obj) throws SQLException {

    }

    @Override
    protected void prepareStatementForDelete(PreparedStatement statement, Faculties obj) throws SQLException {

    }

    @Override
    protected List<Faculties> parseResultSet(ResultSet rs) throws SQLException {
        List<Faculties> faculties = new ArrayList<>();
        while (rs.next()) {
            Faculties fac = new Faculties(rs.getInt("UniversityID"), rs.getString("name"));
            faculties.add(fac);
        }
        return faculties;
    }
}
