class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int x = solve(nums, k);
        int y = solve(nums, k-1);
        return x-y;
    }

    public int solve(int[] nums, int goal) {
        if(goal < 0) {
            return 0;
        }
        int l = 0, r = 0, cnt = 0, sum = 0;
        while(r<nums.length) {
            sum += nums[r]%2;
            while(sum > goal) {
                sum -= nums[l]%2;
                l++;
            }
            cnt = cnt + (r-l+1);
            r++;
        }
        return cnt;
    }
}