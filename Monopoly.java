import java.util.Scanner;
    public class Mono{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            while(a!=0){
                int b=sc.nextInt();
                int c=sc.nextInt();
                int d=sc.nextInt();
                if(b+c<d || c+d<b || d+b<c){
                   System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                a-=1;
                
            }
    
        }
    }