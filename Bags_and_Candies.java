import java.util.Scanner;
public class Bags{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int m=sc.nextInt();
        float d=(float)n/(k*m);
        System.out.println((int)Math.ceil(d));
    }
}