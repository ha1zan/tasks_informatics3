import java.util.Scanner;

public class task18r{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int result = 0;

        for (int x = 0; x <= 1000; x++) {
            if (x != e) {
                int y = a * x * x * x + b * x * x + c * x + d;

                if (y == 0) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
