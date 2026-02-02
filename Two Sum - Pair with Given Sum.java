Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.

import java.util.Arrays;
class Solution {
    boolean twoSum(int arr[], int target) {
        Arrays.sort(arr); 
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++; 
            } else {
                right--; 
            }
        }
        return false;
    }
}
