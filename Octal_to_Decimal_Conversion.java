import java.util.Scanner;
public class Octal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int b=Integer.parseInt(s,8);
        System.out.println(b);
    }
}