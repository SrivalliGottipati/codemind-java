import java.util.Scanner;
public class Mon{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=30*b;
        if(c<=a){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}