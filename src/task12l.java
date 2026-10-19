import java.util.Scanner;
public class task12l{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        int result=0;
        int power=1;
        while(x>0){
            int dijit = x%10;
            result=result+dijit*power;
            power*=2;
            x=x/10;
        }

        System.out.println(result);


    }
}