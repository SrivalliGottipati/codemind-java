import java.util.Scanner;
public class Str{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String vowels="AEIOUaeiou";
    int vowelcount=0;
    for(int i=0;i<s.length();i++){
        if(vowels.contains(""+s.charAt(i))){
            vowelcount++;
        }
    }
    System.out.println(vowelcount);
   }
}