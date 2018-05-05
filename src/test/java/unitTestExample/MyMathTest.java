package unitTestExample;

import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class MyMathTest {
    private int a,b,expResult;

    public MyMathTest(int a, int b, int expResult) {
        this.a = a;
        this.b = b;
        this.expResult = expResult;
    }

    @Rule
    public TestRule timeout = new Timeout(300);


    @Parameterized.Parameters
    public static Collection numbers() {
        return Arrays.asList(new Object[][]{{1, 2, 3},
                {2,9,11}, {3,3,6}});
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() {
        System.out.println("add");
//        int a = 2;
//        int b = 3;
//        int expResult = 5;
        int result = MyMath.add(a, b);
        assertEquals(expResult, result);
//        fail("The test case is a prototype");
    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void testDiv() {
        System.out.println("div");
        int a = 8;
        int b = 2;
        int expResult = 4;
        int result = MyMath.div(a, b);
        assertEquals(expResult, result);
//        fail("The test case is a prototype"
    }
}