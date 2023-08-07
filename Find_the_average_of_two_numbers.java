import java.util.Scanner;
public class Avg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        float c=(float)(a+b)/2;
        System.out.printf("%.4f",c);
    }
}