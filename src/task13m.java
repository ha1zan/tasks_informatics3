import java.util.Scanner;

public class task13m {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            if (x == 0) {
                result++;
            }
        }

        System.out.println(result);
    }
}
