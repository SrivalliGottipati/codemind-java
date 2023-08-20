import java.util.Scanner;
public class Pro{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<b){
            System.out.println("Profit");
        }
        else if(a>b){
            System.out.println("Loss");
        }
        else{
            System.out.println("No profit and No loss");
        }
    }
}