import java.util.Scanner;
public class Even{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
               c+=arr[i]; 
            }
        }
        System.out.println(c);
    }
}