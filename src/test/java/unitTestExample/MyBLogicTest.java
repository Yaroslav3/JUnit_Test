package unitTestExample;


import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class MyBLogicTest {

    private Mockery cnt = new Mockery();

    public MyBLogicTest() {
    }

    @Test
    public void editItem() throws SQLException {
        System.out.println("editTest");
        int id = 5;
        String newName = "abc";
        DBInt db = cnt.mock(DBInt.class);

        cnt.checking(new Expectations() {{
            oneOf(db).find(id);
            oneOf(db).save(id, newName);
            will(returnValue(2));
        }});

        MyBLogic instance = new MyBLogic();
        int expResult = 1;
        int result = instance.editItem(id, newName, db);
        assertEquals (expResult, result);
    }
}