import java.util.Scanner;
public class Ab{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0,d=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                c+=arr[i];
            }
            else{
                d+=arr[i];
            }
        }
        System.out.println(Math.abs(c-d));
    }
}