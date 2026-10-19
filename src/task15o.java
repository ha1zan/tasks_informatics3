import java.util.Scanner;

public class task15o{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            if (x == 0) {
                found = true;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
