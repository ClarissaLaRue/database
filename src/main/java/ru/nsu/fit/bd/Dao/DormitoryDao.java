package ru.nsu.fit.bd.Dao;

import org.springframework.stereotype.Repository;
import ru.nsu.fit.bd.model.Dormitory;

import javax.transaction.Transactional;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class DormitoryDao extends AbstractJDBCDao<Dormitory, String>{
    @Override
    public String getSelectQuery() {
        return "SELECT * FROM DORMITORY ";
    }

    @Override
    protected String getPKQuery() {
        return "SELECT AVG(DORMITORY.State), AVG(DORMITORY.Shower), AVG(DORMITORY.Kitchen), AVG(DORMITORY.PersonsCount) , AVG(DORMITORY.Price) FROM DORMITORY, UNIVERSITY " +
                "WHERE UNIVERSITY.Name = ? AND DORMITORY.UniversityID = UNIVERSITY.ID;";
    }

    @Override
    protected void prepareStatementForGetByPK(PreparedStatement statement, String primaryKey) throws SQLException {
        statement.setString(1, primaryKey);
    }

    @Override
    protected List<Dormitory> parseResultSet(ResultSet rs) throws SQLException {
        List<Dormitory> dormitories = new ArrayList<>();
        while (rs.next()) {
            Dormitory newinfo = new Dormitory();
            newinfo.setState(rs.getFloat("AVG(DORMITORY.State)"));
            newinfo.setShower(rs.getFloat("AVG(DORMITORY.Shower)"));
            newinfo.setKitchen(rs.getFloat("AVG(DORMITORY.Kitchen)"));
            newinfo.setPersonsCount(rs.getFloat("AVG(DORMITORY.PersonsCount)"));
            newinfo.setPrice(rs.getFloat("AVG(DORMITORY.Price)"));
            dormitories.add(newinfo);
        }
        return dormitories;
    }
}
