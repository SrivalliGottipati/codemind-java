import java.util.Scanner;
public class Grades{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>50 && b>60 && c>100){
            System.out.println(10);
        }
        if(a>50 && b>60 && c<=100){
            System.out.println(9);
        }
        if(b>60 && c>100 && a<=50){
            System.out.println(8);
        }
        if(a>50 && c>100 && b<=60){
            System.out.println(7);
        }
        if(a>50 && b<=60 && c<=100){
            System.out.println(6);
        }
        if(a<=50 && b>60 && c<=100){
            System.out.println(6);
        }
        if(a<=50 && b<=60 && c>100){
            System.out.println(6);
        }
        if(a<=50 && b<=60 && c<=100){
            System.out.println(5);
        }
    }
}