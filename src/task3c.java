import java.util.Scanner;
public class task3c{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b= scanner.nextInt();

        for(int i=a; i<=b; i++){
            if(Math.sqrt(i)%1==0) {
                System.out.print(i+ " ");
            }
        }


    }
}
