import java.util.Scanner;
public class Spy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int c=0;
        int d=1;
        while(n>0){
           int  r=n%10;
            c+=r;
            d*=r;
            n=(int)n/10;
        }
        if(c==d){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
    }
}