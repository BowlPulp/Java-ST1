public class ClosestFibo {
    public static void main(String[] args) {
        int n = 20;
        if(n==0){
            System.out.println("0");
            return;
        }

        int first = 0;
        int second = 1;
        int third = first+second;
        while(third<=n){
            first=second;
            second=third;
            third=first+second;
        }
        int ans = (Math.abs(third-n)>= Math.abs(second-n)?second:third);
        System.err.print(ans);
    }
}
