import java.util.Scanner;
public class SummationRecursive14 {

    static int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();

        int result = sumRecursive(n);
        System.out.println("Sum 1.."+ n + " = " + result);

        sc.close();
    }
}
