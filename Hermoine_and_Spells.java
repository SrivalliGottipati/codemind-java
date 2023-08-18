import java.util.Scanner;
public class Her{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>a+c &&b+c<a+b){
            System.out.println(a+b);
        }
        else if(a+c>b+c){
            System.out.println(a+c);
        }
        else{
            System.out.println(b+c);
        }
    }
}