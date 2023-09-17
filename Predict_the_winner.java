import java.util.Scanner;
public class Predict{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        int d=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                c+=arr[i];
            }
            else{
                d+=arr[i];
            }
        }
        int e=Math.abs(c-d);
        if(e%4==0){
            System.out.println("X");
        }
        else{
            System.out.println("Y");
        }
    }
}