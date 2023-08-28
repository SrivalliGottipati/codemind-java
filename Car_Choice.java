import java.util.Scanner;
public class Car{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            float s=(float)y1/x1;
            float s1=(float)y2/x2;
            if(s>s1){
                System.out.println("1");
            }
            else if(s==s1){
                System.out.println("0");
            }
            else{
                System.out.println("-1");
            }
        }
    }
}