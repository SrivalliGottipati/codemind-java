import java.util.Scanner;
public class Num{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%9==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}