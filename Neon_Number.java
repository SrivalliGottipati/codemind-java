import java.util.Scanner;
public class Neon{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=n;
        int c=0,r,d=0;
        while(n>0){
             r=n%10;
            c+=r*r;
            n=(int)n/10;
        }
        while(c>0){
            r=c%10;
            d+=r;
            c=(int)c/10;
        }
        //System.out.println(c);
        if(b==d){
        System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
}