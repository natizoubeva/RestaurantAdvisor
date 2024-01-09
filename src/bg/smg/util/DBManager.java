package bg.smg.util;

/**
 *
 * @author n.m.borisova
 */

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

public class DBManager {

    private static DBManager instance;
    private final DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    DBManager() throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/restaurant_advisor");
        dataSource.setUser("root");
        dataSource.setPassword(null);
        this.dataSource = dataSource;
    }

    public static synchronized DBManager getInstance() throws SQLException {
        if(instance == null) {
            instance = new DBManager();
        }
        return instance;
    }

}