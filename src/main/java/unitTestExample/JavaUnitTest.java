package unitTestExample;

import java.sql.SQLException;

public class JavaUnitTest {
    public static void main(String[] args) throws SQLException {
//        System.out.println(MyMath.add(1,2));
//        System.out.println(MyMath.div(8,2));
        new MyBLogic().editItem(8, "abc", new DBase());

    }
}
