import java.util.Scanner;
public class Words{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        System.out.println(arr.length);
    }
}