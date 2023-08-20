import java.util.Scanner;
public class Pal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int original=a;
        int reverse=0;
        while(a!=0){
           int remain=a%10;
            a=a/10;
            reverse= reverse*10+remain;
        }
        if(original==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}