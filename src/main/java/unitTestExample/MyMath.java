package unitTestExample;

public class MyMath {

    public static int add(int a, int b) {

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a + b;
    }

    public static int div(int a, int b) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a / b;
    }
}
