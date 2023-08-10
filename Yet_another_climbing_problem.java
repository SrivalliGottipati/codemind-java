import java.util.Scanner;
public class Climb{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a!=0){
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=b/c;
            int e=b-(d*c);
            System.out.println(d+e);
            a-=1;
        }
    }
}