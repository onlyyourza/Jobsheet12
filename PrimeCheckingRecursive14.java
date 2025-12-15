import java.util.Scanner;
public class PrimeCheckingRecursive14 {

    static boolean isPrimeRecursive(int n, int divisor) {
        if (n <= 1) return false;
        if (divisor == n) return true;
        if (n % divisor == 0) return false;
        return isPrimeRecursive(n, divisor + 1);
    }

    static boolean isPrime(int n) {
        return isPrimeRecursive(n, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();

        System.out.println(n + (isPrime(n) ? " is PRIME" : " is NOT PRIME"));

        sc.close();
    }
}
