package ru.nsu.fit.bd.Dao;

import org.springframework.stereotype.Repository;
import ru.nsu.fit.bd.model.Universities;

import javax.transaction.Transactional;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class UniversitiesDao extends AbstractJDBCDao<Universities, Universities> {

    @Override
    public String getSelectQuery() {
        return "SELECT * FROM UNIVERSITY";
    }

    @Override
    protected String getPKQuery() {
        return "SELECT * FROM UNIVERSITY WHERE name = ? AND link = ?;";
    }

    @Override
    protected void prepareStatementForGetByPK(PreparedStatement statement, Universities obj) throws SQLException {
        statement.setInt( 1, obj.getUniversityId() );
        statement.setString( 2, obj.name() );
        statement.setURL( 3, obj.getLink() );
    }

    @Override
    protected List<Universities> parseResultSet(ResultSet rs) throws SQLException {
        List<Universities> universities = new ArrayList<>();
        while (rs.next()) {
            Universities uni = new Universities(rs.getInt("ID"), rs.getString("name"), rs.getURL("link"));
            universities.add(uni);
        }
        return universities;
    }

}
