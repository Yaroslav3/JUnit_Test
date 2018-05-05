package unitTestExample;

import java.sql.SQLException;

public class DBase implements DBInt {

    public String find(int id) {
        System.out.println("find " + id);
        if (id < 100) {
            return "test name";
        } else return null;
    }

    public int save(int id, String name) throws SQLException {
        System.out.println("save " + id);
        if (id < 10) {
            return 1;
        } else throw new SQLException("SQL error");
    }
}
