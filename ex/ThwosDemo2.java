package ex;

public class ThwosDemo2 {
    public static void main(String[] args) {
        int n = 10;
        try {
            printNTimes(n);
        } catch (InterruptedException e) {
            System.out.println("Interupted");
        }
    }

    private static void printNTimes(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }

}
