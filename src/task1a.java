import java.util.Scanner;
public class task1a{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b= scanner.nextLong();
        for(long i=a; i<=b; i++){
            if(i%2==0) {
                System.out.print(i+ " ");
            }
        }


    }
}