import java.util.Scanner;
public class Ar{
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
        int d=c/n;
        int e=0;
        for(int i=0;i<n;i++){
            if(d==arr[i]){
                e+=1;
                
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