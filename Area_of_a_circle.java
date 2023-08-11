import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float b=(float)3.14*a*a;
        System.out.printf("%.2f",b);
    }
}