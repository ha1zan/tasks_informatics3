import java.util.Scanner;
public class task10j{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        for(int i=1; i<=100; i++){
            int n = scanner.nextInt();
            sum+=n;
        }
        System.out.println(sum);


    }
}
