package unittesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TriangleVerifierImplTest {
    private TriangleVerifier underTest;

    @Before
    public void setUap() {
        underTest = new TriangleVerifierImpl();

    }

    @Test
    public void triangleSanityTest(){
        assertTrue("qwe",underTest.verifyTriangle(3,4,3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void triangleAreaZeroParameterTest() {
        underTest.verifyTriangle(0, 1, 2);

        fail("Zero side length is forbidden");
    }


    @Test(expected = IllegalArgumentException.class)
    public void triangleAreaNegativeParameterTest() {
        underTest.verifyTriangle(0, -1, 2);

        fail("Zero side length is forbidden");
    }

    @Test(expected = IllegalArgumentException.class)
    public void triangleAreaUnacceptableParameterTest() {
        underTest.verifyTriangle(1, 1, 8);

        fail("Sides of triangle should not fit");
    }
}