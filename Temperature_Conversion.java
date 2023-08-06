import java.util.Scanner;
public class Conert{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a;
        a=sc.nextInt();
        float b=(float)(a*9/5)+32;
        System.out.printf("%.2f",b);
        
    }
}