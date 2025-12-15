import java.util.Scanner;
public class Fibonacci14 {

    static int fib(int month) {
        if (month <= 2) return 1;
        return fib(month - 1) + fib(month - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input month: ");
        int month = sc.nextInt();

        int totalPairs = fib(month);
        System.out.println("Total guinea pig pairs at month " + month + " = " + totalPairs);

        sc.close();
    }
}
