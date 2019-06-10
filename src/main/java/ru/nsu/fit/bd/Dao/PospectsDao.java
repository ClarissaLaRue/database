package ru.nsu.fit.bd.Dao;

import org.springframework.stereotype.Repository;
import ru.nsu.fit.bd.model.Pospects;

import javax.transaction.Transactional;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class PospectsDao extends AbstractJDBCDao<Pospects, String>{
    @Override
    public String getSelectQuery() {
        return "SELECT * FROM POSPECTS";
    }

    @Override
    protected String getPKQuery() {
        return "SELECT AVG(POSPECTS.IssueYear), AVG(POSPECTS.StartSelary), AVG(POSPECTS.UsefullStuding), AVG(POSPECTS.Placement) FROM POSPECTS, UNIVERSITY " +
                "WHERE UNIVERSITY.Name = ? AND POSPECTS.UniversityID = UNIVERSITY.ID;";
    }

    @Override
    protected void prepareStatementForGetByPK(PreparedStatement statement, String primaryKey) throws SQLException {
        statement.setString(1, primaryKey);
    }

    @Override
    protected List<Pospects> parseResultSet(ResultSet rs) throws SQLException {
        List<Pospects> pospects = new ArrayList<>();
        while (rs.next()) {
            Pospects newinfo = new Pospects();
            newinfo.setIssueYear(rs.getFloat("AVG(POSPECTS.IssueYear)"));
            newinfo.setStartSelary(rs.getFloat("AVG(POSPECTS.StartSelary)"));
            newinfo.setUsefullStuding(rs.getFloat("AVG(POSPECTS.UsefullStuding)"));
            newinfo.setPlacement(rs.getFloat("AVG(POSPECTS.Placement)"));
            pospects.add(newinfo);
        }
        return pospects;
    }
}
