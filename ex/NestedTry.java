package ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int divide = 0;
        try {
            try {
                a = sc.nextInt();
                b = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Catch Block InputMismatchException Ocuured");
            }
            divide = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Catch Block ArithmeticException Ocuured");
        }
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("divide:" + divide);

    }
}
