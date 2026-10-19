import java.util.Scanner;

public class task14n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int zero = 0;
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            if (x == 0) {
                zero++;
            } else if (x > 0) {
                positive++;
            } else {
                negative++;
            }
        }

        System.out.println(zero);
        System.out.println(positive);
        System.out.println(negative);
    }
}
