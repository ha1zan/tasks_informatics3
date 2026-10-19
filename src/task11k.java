import java.util.Scanner;
public class task11k{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int sum=0;
        for(int i=1; i<=a; i++){
            int n = scanner.nextInt();
            sum+=n;
        }
        System.out.println(sum);


    }
}