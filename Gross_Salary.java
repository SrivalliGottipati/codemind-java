import java.util.Scanner;
public class Gross{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float b;
        if (a<=10000){
           b=a+(a*(80.0f/100.0f))+(a*(20.0f/100.0f));
         
        }
        else if(a<=20000){
            b=a+(a*(90.0f/100.0f))+(a*(25.0f/100.0f));
        }
        else{
            b=a+(a*(95.0f/100.0f))+(a*(30.0f/100.0f));
        }
        System.out.printf("%.2f",b);
    }
}