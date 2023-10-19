import java.util.Scanner;

public class PrimeCount {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R=sc.nextInt();
        int count = 0;
        for (int j = L; j <= R; j++) {
            if (isPrime(j)) count++;
        }
        System.out.println(count);
        sc.close();
    }
}