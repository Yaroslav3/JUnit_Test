package testDemo;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class NumbersTest {
    private static final double DELTA = 0.001;

    private Numbers numbers = new Numbers();

    @Test
    public void calcSumFormToN() {

    }

    @Test
    public void powerAToB() {

        double result = numbers.powerAToB(2, 2);
        double expResult = 4.0;
        assertThat("OK", expResult, closeTo(result, DELTA));
    }

}