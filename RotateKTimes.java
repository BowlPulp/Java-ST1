public class RotateKTimes {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7};
        int n = nums.length;
        int k = 4;
        reverse(nums, k);

        //print
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void reverse(int []nums, int k){
        int n = nums.length;
        k=k%n;
        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);
    }

    public static void swap(int[] nums, int st, int end){
        while(st<end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }

}
