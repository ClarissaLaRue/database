package ru.nsu.fit.bd;

import org.springframework.stereotype.Repository;
import ru.nsu.fit.bd.model.BriefInfo;

import javax.transaction.Transactional;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class BriefInfoDao extends AbstractJDBCDao<BriefInfo, String> {
    @Override
    public String getSelectQuery() {
        return "SELECT * FROM BRIEFINFO";
    }

    @Override
    protected String getPKQuery() {
        return "SELECT AVG(BRIEFINFO.Impression), AVG(BRIEFINFO.Classes), AVG(BRIEFINFO.Dormitory), " +
                "AVG(BRIEFINFO.Infrastructure), AVG(BRIEFINFO.Teachers), AVG(BRIEFINFO.Scholarship), " +
                "AVG(BRIEFINFO.Pospects) FROM BRIEFINFO, UNIVERSITY " +
                "WHERE UNIVERSITY.Name = ? AND BRIEFINFO.UniversityID = UNIVERSITY.ID";
    }

    @Override
    protected void prepareStatementForGetByPK(PreparedStatement statement, String primaryKey) throws SQLException {
        statement.setString(1, primaryKey);
    }

    @Override
    protected List<BriefInfo> parseResultSet(ResultSet rs) throws SQLException {
        List<BriefInfo> info = new ArrayList<>();
        while (rs.next()) {
            BriefInfo newInfo = new BriefInfo();
            newInfo.setImpression(rs.getFloat("AVG(BRIEFINFO.Impression)"));
            newInfo.setClasses(rs.getFloat("AVG(BRIEFINFO.Classes)"));
            newInfo.setDormitory(rs.getFloat("AVG(BRIEFINFO.Dormitory)"));
            newInfo.setInfrastructure(rs.getFloat("AVG(BRIEFINFO.Infrastructure)"));
            newInfo.setTeachers(rs.getFloat("AVG(BRIEFINFO.Teachers)"));
            newInfo.setScholarship(rs.getFloat("AVG(BRIEFINFO.Scholarship)"));
            newInfo.setPospects(rs.getFloat("AVG(BRIEFINFO.Pospects)"));
            info.add(newInfo);
        }
        return info;
    }
}
