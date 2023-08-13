import java.util.Scanner;
public class Oct{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0;
        while(i<a){
            String b=sc.next();
            int c=Integer.parseInt(b,2);
            String d=Integer.toString(c,8);
            i+=1;
            System.out.println(d);
        }
    }
}