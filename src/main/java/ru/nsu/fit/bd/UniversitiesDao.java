package ru.nsu.fit.bd;

import org.springframework.stereotype.Repository;
import ru.nsu.fit.bd.model.Universities;

import javax.transaction.Transactional;
import java.lang.annotation.Annotation;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class UniversitiesDao extends AbstractJDBCDao<Universities> {

    @Override
    public String getSelectQuery() {
        return "SELECT * FROM UNIVERSITY";
    }

    @Override
    public String getCreateQuery() {
        return "INSERT INTO UNIVERSITY (name, link) \n" +
                "VALUES (?, ?);";
    }

    @Override
    public String getUpdateQuery() {
        return "UPDATE UNIVERSITY SET name = ? and link = ?;";
    }

    @Override
    public String getDeleteQuery() {
        return "DELETE FROM UNIVERSITY WHERE name = ? and link = ?;";
    }

    @Override
    protected String getIdComparisionStatementPart() {
        return "WHERE name = ? AND link = ?;";
    }

    @Override
    protected void prepareStatementForGetByPK(PreparedStatement statement, Universities obj) throws SQLException {
        statement.setInt( 1, obj.getUniversityId() );
        statement.setString( 2, obj.name() );
        statement.setURL( 3, obj.getLink() );
    }

    @Override
    protected void prepareStatementForUpdate(PreparedStatement statement, Universities obj) throws SQLException {
        statement.setInt( 1, obj.getUniversityId() );
        statement.setString( 2, obj.name() );
        statement.setURL( 3, obj.getLink() );
    }

    @Override
    protected void prepareStatementForInsert(PreparedStatement statement, Universities obj) throws SQLException {
        statement.setInt( 1, obj.getUniversityId() );
        statement.setString( 2, obj.name() );
        statement.setURL( 3, obj.getLink() );
    }

    @Override
    protected void prepareStatementForDelete(PreparedStatement statement, Universities obj) throws SQLException {
        statement.setInt( 1, obj.getUniversityId() );
        statement.setString( 2, obj.name() );
        statement.setURL( 3, obj.getLink() );
    }

    @Override
    protected List<Universities> parseResultSet(ResultSet rs) throws SQLException {
        List<Universities> universities = new ArrayList<>();
        while (rs.next()) {
            Universities uni = new Universities(rs.getString("name"), rs.getURL("link"));
        }
        return universities;
    }
}
