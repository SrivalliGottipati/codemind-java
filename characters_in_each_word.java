import java.util.Scanner;
public class Word{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        int n;
        for(int i=0;i<arr.length;i++){
             n=arr[i].length();
            System.out.print(n+" ");
        }
    }
}