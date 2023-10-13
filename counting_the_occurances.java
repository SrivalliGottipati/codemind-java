import java.util.Scanner;
public class Occurances{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=sc.next().charAt(0);
        int c1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                c1++;
            }
        }
        if(c1>=1){
            System.out.println(c1);
        }
        else{
            System.out.println("-1");
        }
    }
}