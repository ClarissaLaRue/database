package ru.nsu.fit.bd.Dao;

import org.springframework.stereotype.Repository;
import ru.nsu.fit.bd.model.Teachers;

import javax.transaction.Transactional;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class TeachersDao extends AbstractJDBCDao<Teachers, String>{
    @Override
    public String getSelectQuery() {
        return "SELECT * FROM TEACHERS";
    }

    @Override
    protected String getPKQuery() {
        return "SELECT AVG(TEACHERS.Seminarians), AVG(TEACHERS.Lecturers) FROM TEACHERS, UNIVERSITY " +
                "WHERE UNIVERSITY.Name = ? AND TEACHERS.UniversityID = UNIVERSITY.ID;";
    }

    @Override
    protected void prepareStatementForGetByPK(PreparedStatement statement, String primaryKey) throws SQLException {
        statement.setString(1, primaryKey);
    }

    @Override
    protected List<Teachers> parseResultSet(ResultSet rs) throws SQLException {
        List<Teachers> teachers = new ArrayList<>();
        while (rs.next()) {
            Teachers newteachers = new Teachers();
            newteachers.setSeminarians(rs.getFloat("AVG(TEACHERS.Seminarians)"));
            newteachers.setLecturers(rs.getFloat("AVG(TEACHERS.Lecturers)"));
            teachers.add(newteachers);
        }
        return teachers;
    }
}
