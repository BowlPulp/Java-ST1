import java.util.*;
public class CheckNPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for(int i=0;i<n;i++){
            isPrime(i);
        }
    }

    public static void isPrime(int i){
        if(i == 1){
            System.out.print(1+" ");
        }
        int count = 0;
        for(int a=1;a<=i;a++){
            if(i%a==0){
                count++;
            }
        }
        if(count == 2){
           System.out.print(i+" ");
        }
    }
}

