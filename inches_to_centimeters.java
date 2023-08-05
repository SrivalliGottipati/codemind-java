import java.util.Scanner;
public class Converstion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        float b;
        b=(float)(2.54*a);
        System.out.println(b);
    }
}