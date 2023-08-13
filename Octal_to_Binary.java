import java.util.Scanner;
public class Oct{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        int i=0;
        while(i<e){
            String a=sc.next();
            int b=Integer.parseInt(a,8);
            String c=Integer.toBinaryString(b);
            i+=1;
            System.out.println(c);
        }
    }
}