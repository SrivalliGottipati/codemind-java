import java.util.Scanner;
public class Wei{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1 || n%2==0 && n>6 && n<20)
        {
            System.out.println("weird");
        }
        else
        {
            System.out.println("not weird");
        }
    }
}