import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int c = scanner.nextInt();
        int sum = 0;

        if (a == 13) {
            System.out.println("The sum of the three numbers is " + sum);
            return;
        } else {
            sum += a;
        }

        if (b == 13) {
            System.out.println("The sum of the three numbers is " + sum);
            return;
        } else {
            sum += b;
        }

        if (c == 13) {
            System.out.println("The sum of the three numbers is " + sum);
            return;
        } else {
            sum += c;
        }

        System.out.println("The sum of the three numbers is " + sum);
    }
}
