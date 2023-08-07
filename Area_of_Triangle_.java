import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a,b,c,s;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        float area;
        s=(a+b+c)/2;
        area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}