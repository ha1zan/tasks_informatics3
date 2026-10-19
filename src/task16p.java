import java.util.Scanner;

import java.util.Scanner;

public class task16p {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int x = 0; x <= 1000; x++) {
            int result = a * x * x * x + b * x * x + c * x + d;

            if (result == 0) {
                System.out.println(x);
            }
        }
    }
}