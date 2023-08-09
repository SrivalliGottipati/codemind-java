import java.util.Scanner;
public class Mod{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a/b;
        int d=a-(c*b);
        System.out.println(d);
    }
}