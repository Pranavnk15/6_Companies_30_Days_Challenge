/*
 * Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
 *
 * In one move, you can increment or decrement an element of the array by 1.
 *
 * Test cases are designed so that the answer will fit in a 32-bit integer.
 *
 * Approach:-
 * In this to make equal array, we will first sort the array, 
 * then by taking the middle element, and calulcating the diff with 
 * all the other elements in the array, and summing ti up, 
 * It will result in the minimum moves needed to make array equal.
 * 
 */




class Solution {
	public int minMoves2(int[] nums) {
	   Arrays.sort(nums);
	   int middle = nums[(nums.length/2)];
           int count = 0;
           for(int i = 0; i<nums.length; i++) {
                int diff = Math.abs(nums[i]-middle);
                count += diff;
           }
           return count;
        }
}
