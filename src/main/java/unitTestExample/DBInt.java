package unitTestExample;

import java.sql.SQLException;

public interface DBInt {
    public String find(int id);
    public int save(int id, String name) throws SQLException;
}
