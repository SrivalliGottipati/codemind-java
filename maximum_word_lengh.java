import java.util.Scanner;
public class Min{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        int c=0;
        for(int i=0;i<arr.length;i++){
            int n=arr[i].length();
            if(c<n){
                c=n;
            }
            //System.out.println(c);
        }
       System.out.println(c);
    }
}