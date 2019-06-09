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
public class FacultiesDao extends AbstractJDBCDao<Faculties, String> {
    @Override
    public String getSelectQuery() {
        return "SELECT * FROM FACULTIES";
    }

    @Override
    protected String getPKQuery() {
        return "SELECT FACULTIES.Name FROM FACULTIES, UNIVERSITY WHERE UNIVERSITY.Name = ? AND FACULTIES.UniversityID = UNIVERSITY.ID;";
    }

    @Override
    protected void prepareStatementForGetByPK(PreparedStatement statement, String primaryKey) throws SQLException {
        statement.setString(1, primaryKey);
    }

    @Override
    protected List<Faculties> parseResultSet(ResultSet rs) throws SQLException {
        List<Faculties> faculties = new ArrayList<>();
        while (rs.next()) {
            Faculties fac = new Faculties(rs.getString("name"));
            faculties.add(fac);
        }
        return faculties;
    }
}
