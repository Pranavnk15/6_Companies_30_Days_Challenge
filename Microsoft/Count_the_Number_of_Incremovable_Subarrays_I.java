/*
 * You are given a 0-indexed array of positive integers nums.

A subarray of nums is called incremovable if nums becomes strictly increasing on removing the subarray. For example, the subarray [3, 4] is an incremovable subarray of [5, 3, 4, 6, 7] because removing this subarray changes the array [5, 3, 4, 6, 7] to [5, 6, 7] which is strictly increasing.

Return the total number of incremovable subarrays of nums.

Note that an empty array is considered strictly increasing.

A subarray is a contiguous non-empty sequence of elements within an array.

Approach:- Iin this we will check for every subarray using indexes, as contraints are less
 */



class Solution {
    public int incremovableSubarrayCount(int[] arr) {
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            for(int j = i; j<arr.length; j++) {
                if(isIncreasing(arr, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isIncreasing(int[] arr, int start, int end) {
        int prev = 0;
        for(int i = 0; i<arr.length; i++) {
            if(i <= end && i >= start) {
                continue;
            }

            if(arr[i] <= prev) {
                return false;
            }
            prev = arr[i];
        }
        return true;
    }
}