import java.util.Scanner;
public class Raindrop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0 && n%5!=0 && n%7!=0){
            System.out.println("Pling");
        }
        if(n%5==0 && n%3!=0 &&n%7!=0){
            System.out.println("Plang");
        }
        if(n%7==0 && n%3!=0 && n%5!=0){
            System.out.println("Plong");
        }
        if(n%3==0 && n%5==0){
            System.out.println("PlingPlang");
        }
        if(n%3==0 && n%5==0 && n%7==0){
            System.out.println("PlingPlangPlong");
        }
        if(n%3==0 && n%7==0){
            System.out.println("PlingPlong");
        }
        if(n%5==0 && n%7==0){
            System.out.println("PlangPlong");
        }
        if(n%3!=0 && n%5!=0 && n%7!=0){
            System.out.println(n);
        }
    }
}