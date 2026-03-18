package ex;

public class ThrowsDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int divide = 0;
        try {
            divide = divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

}
