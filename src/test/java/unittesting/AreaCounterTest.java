package unittesting;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class AreaCounterTest {
//    @Rule
//    private Timeout timeout = Timeout.millis(50);

    private static final double DELTA = 0.001;
    private AreaCounter underTest;

    @Mock
    private TriangleVerifier triangleVerifier;

    @BeforeClass
    public static void init() {

        System.out.println("In before class");
    }



    @Before
    public void setUap() {
        System.out.println("In before");
        triangleVerifier = new TriangleVerifierImpl();
        underTest = new AreaCounterImpl(triangleVerifier);

    }

    @Test
    public void triangleAreaWithMixedTest() {
        double actualFirst = underTest.triangleArea(6, 8, 10);
        double actualSecond = underTest.triangleArea(6, 8, 10);
        assertThat("actual result was", actualSecond,
                closeTo(actualFirst, DELTA));
    }

    @Test(timeout = 100)
    public void triangleAreaSanityTest() {
        double actual = underTest.triangleArea(3, 4, 5);
        int expected = 6;
        assertEquals("actual triangleAreaSanityTest", expected, actual, DELTA);
    }

    @Test
    public void triangleAreaSanityTestWithDoubledArgs() {
        double actual = underTest.triangleArea(6, 8, 10);
        double expected = 24;
        assertThat("actual result was", expected,
                closeTo(actual, DELTA));

    }


    @Test
    public void triangleArea() {
        System.out.println("my first test");
    }

    @Test
    public void anotherTriangleArea() {
        System.out.println("my second test");
    }

    @After
    public void triangleAreaTest() {
        System.out.println("After testing");
    }
}