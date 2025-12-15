import java.util.Scanner;
public class DescendingSequenceRecursive14 {

    static void printDescendingRecursive(int n) {
        if (n < 0) return;
        System.out.print(n + (n == 0 ? "" : " "));
        printDescendingRecursive(n - 1);
    }

    static void printDescendingIterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + (i == 0 ? "" : " "));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();

        System.out.print("Recursive : ");
        printDescendingRecursive(n);

        System.out.println();

        System.out.print("Iterative : ");
        printDescendingIterative(n);

        sc.close();
    }
}
