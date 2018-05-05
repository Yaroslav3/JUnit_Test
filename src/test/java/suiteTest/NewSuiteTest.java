package suiteTest;


import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import unitTestExample.MyMathTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({MyMathTest.class})
public class NewSuiteTest {

    @Before
    public void setUp(){
        System.out.println("Before");
    }

    @After
    public void setDn(){
        System.out.println("After");
    }
}
