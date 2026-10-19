import java.util.Scanner;
public class task6f{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();


        int a = 0;

        while(x>0) {
            int dijit=x%10;
            a = a*10+dijit;
            x = x/10;
        }
        System.out.println(a);


    }
}
