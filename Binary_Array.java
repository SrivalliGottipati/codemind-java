import java.util.Scanner;
public class Bi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int e=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0 || arr[i]==1){
                e+=1;
            }
            else{
                e=0;
            }
        }
        if(e>=1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}