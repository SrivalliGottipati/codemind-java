import java.util.Scanner;
public class Max{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int Arr[]=new int[a];
        for(int i=0;i<a;i++){
            Arr[i]=sc.nextInt();
        }
        int M=Arr[0];
        for(int i=1;i<a;i++){
            if(M<Arr[i]){
                M=Arr[i];
            }
        }
        System.out.println(M);
    }
}