import java.util.Scanner;
public class Min{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=arr[0];
        for(int i=1;i<n;i++){
            if(m>arr[i]){
                m=arr[i];
            }
        }
        System.out.println(m);
    }
}