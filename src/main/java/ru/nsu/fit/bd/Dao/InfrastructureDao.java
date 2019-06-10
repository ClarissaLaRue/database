package ru.nsu.fit.bd.Dao;

import org.springframework.stereotype.Repository;
import ru.nsu.fit.bd.model.Infrastructure;

import javax.transaction.Transactional;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class InfrastructureDao extends AbstractJDBCDao<Infrastructure, String>{
    @Override
    public String getSelectQuery() {
        return "SELECT * FROM INFRASTRUCTURE";
    }

    @Override
    protected String getPKQuery() {
        return "SELECT * FROM INFRASTRUCTURE, UNIVERSITY " +
                "WHERE UNIVERSITY.Name = ? AND INFRASTRUCTURE.UniversityID = UNIVERSITY.ID;";
    }

    @Override
    protected void prepareStatementForGetByPK(PreparedStatement statement, String primaryKey) throws SQLException {
        statement.setString(1, primaryKey);
    }

    @Override
    protected List<Infrastructure> parseResultSet(ResultSet rs) throws SQLException {
        List<Infrastructure> Info = new ArrayList<>();
        while (rs.next()) {
            Infrastructure newInfo = new Infrastructure();
            newInfo.setCafeFood(rs.getString("CafeFood"));
            newInfo.setCafePrice(rs.getString("CafePrice"));
            newInfo.setCafeService(rs.getString("CafeService"));
            newInfo.setCinema(rs.getString("Cinema"));
            newInfo.setShoppingCenter(rs.getString("ShoppingCenter"));
            newInfo.setUnderground(rs.getString("Underground"));
            newInfo.setBusStops(rs.getString("BusStops"));
            Info.add(newInfo);
        }
        return Info;
    }
}
