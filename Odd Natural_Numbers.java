import java.util.Scanner;
public class Odd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a/2;i++){
            int b=(i*2)-1;
             System.out.print(b+" ");
            
            
        }
    }
}