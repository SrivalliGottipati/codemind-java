import java.util.Scanner;
public class Mario{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==2){
            System.out.println("SMALL");
        }
        else if(a%3==1){
            System.out.println("HUGE");
        }
        else{
            System.out.println("NORMAL");
        }
    }
}