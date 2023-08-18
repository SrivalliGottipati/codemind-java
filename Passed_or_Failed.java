import java.util.Scanner;
public class Pass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        if(a>=35 && b>=35 && c>=35 && d>=35 &&e>=35){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }
    }
}