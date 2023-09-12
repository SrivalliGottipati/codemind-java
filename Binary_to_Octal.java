import java.util.Scanner;
public class Binary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
            long binaryNumber=sc.nextLong();
            int octalNumber = 0, decimalNumber = 0, i = 0;

    while (binaryNumber != 0) {
      decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
      ++i;
      binaryNumber /= 10;
    }

    i = 1;

    while (decimalNumber != 0) {
      octalNumber += (decimalNumber % 8) * i;
      decimalNumber /= 8;
      i *= 10;
    }
            System.out.println(octalNumber);
        }
    }
}