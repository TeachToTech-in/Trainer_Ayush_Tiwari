package ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int divide = 0;
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            divide = a / b;
        } catch (InputMismatchException e) {
            System.out.println("Catch Block InputMismatchException Ocuured");
        } catch (ArithmeticException e) {
            System.out.println("Catch Block ArithmeticException Ocuured");
        } catch (Exception e) {
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("finally block");
            sc.close();
        }
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("divide:" + divide);

    }
}
