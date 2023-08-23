import java.util.Scanner;
public class Equi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
           int c=0;
           for(int j=0;j<i;j++){
               c+=arr[j];
           }
           int d=0;
           for(int j=i+1;j<n;j++){
               d+=arr[j];
           }
           if(c==d)
           {
               System.out.println(i+1);
           }
           
        }
       
        
    }
}