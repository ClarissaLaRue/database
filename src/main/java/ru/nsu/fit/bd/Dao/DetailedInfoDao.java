package ru.nsu.fit.bd.Dao;

import org.springframework.stereotype.Repository;
import ru.nsu.fit.bd.model.DetailedInfo;

import javax.transaction.Transactional;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class DetailedInfoDao extends AbstractJDBCDao<DetailedInfo, String> {
    @Override
    public String getSelectQuery() {
        return "SELECT * FROM DETAILINFO";
    }

    @Override
    protected String getPKQuery() {
        return "SELECT * FROM DETAILINFO, UNIVERSITY WHERE UNIVERSITY.Name = ? AND DETAILINFO.UniversityID = UNIVERSITY.ID";
    }

    @Override
    protected void prepareStatementForGetByPK(PreparedStatement statement, String primaryKey) throws SQLException {
        statement.setString(1, primaryKey);
    }

    @Override
    protected List<DetailedInfo> parseResultSet(ResultSet rs) throws SQLException {
        List<DetailedInfo> detailedInfos = new ArrayList<>();
        while (rs.next()) {
            DetailedInfo newInfo = new DetailedInfo();
            newInfo.setImpression(rs.getString("Impression"));
            newInfo.setClasses(rs.getString("Classes"));
            newInfo.setDormitory(rs.getString("Dormitory"));
            newInfo.setInfrastructure(rs.getString("Infrastructure"));
            newInfo.setTeachers(rs.getString("Teachers"));
            newInfo.setScholarship(rs.getString("ScholarshipDao"));
            detailedInfos.add(newInfo);
        }
        return detailedInfos;
    }
}
