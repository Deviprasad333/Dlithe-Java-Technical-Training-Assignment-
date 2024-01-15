import java.util.Scanner;

public class GreenLottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();

        int result = calculate_Result(a, b, c);

        System.out.println("The result is: " + result);
    }

    private static int calculate_Result(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            return 0;
        } else if (a == b && b == c) {
            return 20;
        } else {
            return 10;
        }
    }
}
