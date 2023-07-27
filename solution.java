/*
6911. Continuous Subarrays

You are given a 0-indexed integer array nums. A subarray of nums is called continuous if:

Let i, i + 1, ..., j be the indices in the subarray. Then, for each pair of indices i <= i1, i2 <= j, 0 <= |nums[i1] - nums[i2]| <= 2.
Return the total number of continuous subarrays.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [5,4,2,4]
Output: 8
Explanation: 
Continuous subarray of size 1: [5], [4], [2], [4].
Continuous subarray of size 2: [5,4], [4,2], [2,4].
Continuous subarray of size 3: [4,2,4].
Thereare no subarrys of size 4.
Total continuous subarrays = 4 + 3 + 1 = 8.
It can be shown that there are no more continuous subarrays.
 

Example 2:

Input: nums = [1,2,3]
Output: 6
Explanation: 
Continuous subarray of size 1: [1], [2], [3].
Continuous subarray of size 2: [1,2], [2,3].
Continuous subarray of size 3: [1,2,3].
Total continuous subarrays = 3 + 2 + 1 = 6.
 


*/
// solve according to the problem statements and example(s) given

class Solution{
    public long continuousSubarrays(int[] nums) {
        // Write your code here
        int n = nums.length;
        long ans = 0;
        for(int i = 0; i < n; i++){
            int min = nums[i];
            int max = nums[i];
            for(int j = i; j < n; j++){
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                if(max - min <= 1){
                    ans++;
                }
            }
        }
        return ans;
    }
}

