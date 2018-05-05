package unitTestExample;

import java.sql.SQLException;

public class MyBLogic {
    public int editItem(int id, String newName, DBInt db) throws SQLException {
        System.out.println("edit item " + id);
        String itemName = db.find(id);
        if (itemName != null) {
            itemName = newName;
            int res = db.save(id, itemName);
            if(res==2) System.out.println("res==2!!!!");
        }
        else throw new IllegalArgumentException("record with id" + id + "not found");
        return 1;
    }
}
