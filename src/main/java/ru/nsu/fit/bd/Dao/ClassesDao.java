package ru.nsu.fit.bd.Dao;

import org.springframework.stereotype.Repository;
import ru.nsu.fit.bd.model.Classes;

import javax.transaction.Transactional;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class ClassesDao extends AbstractJDBCDao<Classes, String> {
    @Override
    public String getSelectQuery() {
        return "SELECT * FROM CLASSES";
    }

    @Override
    protected String getPKQuery() {
        return "SELECT AVG(CLASSES.Profile), AVG(CLASSES.NonProfile) FROM CLASSES, UNIVERSITY WHERE UNIVERSITY.Name = ? AND CLASSES.UniversityID = UNIVERSITY.ID";
    }

    @Override
    protected void prepareStatementForGetByPK(PreparedStatement statement, String primaryKey) throws SQLException {
        statement.setString(1, primaryKey);
    }

    @Override
    protected List<Classes> parseResultSet(ResultSet rs) throws SQLException {
        List<Classes> classes = new ArrayList<>();
        while (rs.next()) {
            Classes newClasses = new Classes();
            newClasses.setProfile(rs.getFloat("AVG(CLASSES.Profile)"));
            newClasses.setNonProfile(rs.getFloat("AVG(CLASSES.NonProfile)"));
            classes.add(newClasses);
        }
        return classes;
    }
}
