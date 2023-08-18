import java.util.Scanner;
public class Qualify{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=2*c;
        if(b+d>=a){
            System.out.println("Qualify");
        }
        else{
            System.out.println("Not Qualify");
        }
    }
}