import java.util.Scanner;
public class Nat{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=a;i>=1;i--){
            System.out.print(2*i+" ");
        }
    }
}