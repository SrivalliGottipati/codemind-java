import java.util.Scanner;
public class Car{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float b=(float)a/4;
        System.out.println((int)Math.ceil(b));
    }
}