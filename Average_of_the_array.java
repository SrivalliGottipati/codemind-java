import java.util.Scanner;
public class Avg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            c+=arr[i];
        }
        float d=(float)c/n;
        System.out.printf("%.2f",d);
    }
}