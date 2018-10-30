package team.yingyingmonster.ccs.commons.log4j2;

import org.apache.logging.log4j.core.appender.db.jdbc.ConnectionSource;
import org.logicalcobwebs.proxool.ProxoolDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Juer Whang <br/>
 * - project: CompanyCheckSystem
 * - create: 15:18 2018/10/29
 * -
 **/

public class JuerDataSource implements ConnectionSource {
    private ProxoolDataSource dataSource;

    public JuerDataSource () {
        System.out.println("23333");
        try {
            System.out.println("start!");
            Class.forName("org.logicalcobwebs.proxool.ProxoolDriver");
            System.out.println("end!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dataSource = new ProxoolDataSource();
        } catch (Error e) {
            System.out.println("exception!");
            e.printStackTrace();
        }
        dataSource.setAlias("Develop");
        dataSource.setDriver("oracle.jdbc.OracleDriver");
        dataSource.setDriverUrl("jdbc:jdbc:oracle:thin:@localhost:1521:test");
        dataSource.setUser("SEASON4USER");
        dataSource.setPassword("juergenie");
        dataSource.setHouseKeepingSleepTime(60000);
        dataSource.setHouseKeepingTestSql("select 1 from dual");
        dataSource.setPrototypeCount(5);
        dataSource.setMaximumConnectionCount(100);
        dataSource.setMinimumConnectionCount(5);
    }

    @Override
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
