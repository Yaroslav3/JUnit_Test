package unitTesting;

public class TriangleVerifierImpl implements TriangleVerifier {


    @Override
    public boolean verifyTriangle(double a, double b, double c) {
       return zeroNegative(a, b, c) && triangleInequalityCheck(a, b, c);
    }


    private boolean triangleInequalityCheck(double a, double b, double c) {
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalArgumentException("Sides of triangle should be Good.");
        }
        return true;
    }

    private boolean zeroNegative(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Side can`t be zero or negative number.");
        }
        return true;
    }
}
