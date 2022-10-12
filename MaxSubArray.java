public class MaxSubArray
{
    public static void main(String[] args)
    {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(nums);
        System.out.println(ans);
    }

    //O(N) Kaden's Algorithm : Linear Search, we carry negative sums too
    public static int maxSubArray(int[] nums)
    {
        int maxi = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0)
                sum = 0;
            sum += nums[i];
            if (sum > maxi)
                maxi = sum;
        }
        return maxi;
    }
}