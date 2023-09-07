import java.util.Scanner;
public class Min{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        int c=arr[0].length();
        for(int i=0;i<arr.length;i++){
            int n=arr[i].length();
            if(n<c){
                c=n;
            }
        }
       System.out.println(c);
    }
}