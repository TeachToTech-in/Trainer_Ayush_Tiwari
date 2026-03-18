package ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int divide = 0;

        try {
            a = sc.nextInt();
            b = sc.nextInt();
            if (b == 0) {
                throw new MyExceptions();
            }
        } catch (MyExceptions e) {
            b = 10;
            System.out.println(e.getMessage());
           // e.printStackTrace();
        }
        divide = a / b;

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("divide:" + divide);

    }

}
