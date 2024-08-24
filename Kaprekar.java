
import java.util.Scanner;

public class Kaprekar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //number input;
        isKaprekar(n);
        sc.close();
    }

    public static void isKaprekar(int n) {
        int square = n * n;
        int a;
        int b = 1;
        int c = 1;
        int flag = 1;
        while (b != 0) {
            a = square % c;
            b = square / c;
            if ((a + b) == n) {
                System.out.println(n + " is a Kaprekar number.");
                flag = 0;
            }
            c = c * 10;
        }
        if (flag == 1) {
            System.out.println(n + " is not a Kaprekar number.");
        }
    }
}
