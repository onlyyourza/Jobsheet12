import java.util.Scanner;
public class PowerRecursive14 {
    static int calculatePower(int base, int pow) {
        if (pow == 0) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print(base + "x");
            return base * calculatePower(base, pow - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = input.nextInt();
        System.out.print("Enter power number: ");
        int pow = input.nextInt();

        System.out.print("Result: ");
        int result = calculatePower(base, pow);
        System.out.println(" = " + result);

        input.close();
    }
}
