import java.util.Scanner;
public class Kohli{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%10==0){
            System.out.println(a/10);
        }
        else if(a%10!=0 && a%5==0){
            int b=a/10;
            int c=(a%10)/5;
            System.out.println(b+c);
        }
        else{
            System.out.println("-1");
        }
            
    }
}