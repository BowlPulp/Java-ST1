public class MissingNumber {
    public static void main(String[] args) {
        // n = 5;
        // 1 2 3 5;
        int sum = 0;
        int n = 5;
        int asum = 1+2+3+5;
        sum = n*(n+1)/2;

        System.out.println(sum-asum);
    }
}
