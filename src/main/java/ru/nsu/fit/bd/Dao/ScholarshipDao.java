package ru.nsu.fit.bd.Dao;

import org.springframework.stereotype.Repository;
import ru.nsu.fit.bd.model.Scholarship;

import javax.transaction.Transactional;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class ScholarshipDao extends AbstractJDBCDao<Scholarship, String>{
    @Override
    public String getSelectQuery() {
        return "SELECT * FROM SHOLARSHIP";
    }

    @Override
    protected String getPKQuery() {
        return "SELECT * FROM SHOLARSHIP, UNIVERSITY " +
                "WHERE UNIVERSITY.Name = ? AND SHOLARSHIP.UniversityID = UNIVERSITY.ID;";
    }

    @Override
    protected void prepareStatementForGetByPK(PreparedStatement statement, String primaryKey) throws SQLException {
        statement.setString(1, primaryKey);
    }

    @Override
    protected List<Scholarship> parseResultSet(ResultSet rs) throws SQLException {
        List<Scholarship> scholarships = new ArrayList<>();
        while (rs.next()) {
            Scholarship newScholarship = new Scholarship();
            newScholarship.setType(rs.getString("Type"));
            newScholarship.setHowMuch(rs.getInt("HowMuch"));
            scholarships.add(newScholarship);
        }
        return scholarships;
    }
}
