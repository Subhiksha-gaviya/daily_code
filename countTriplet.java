Given an array arr, count the number of distinct triplets (a, b, c) such that:
    a + b = c
    Each triplet is counted only once, regardless of the order of a and b.


import java.util.Arrays;

class Solution {
    int countTriplet(int arr[]) {
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                int Sum = arr[left] + arr[right];
                
                if (Sum == arr[i]) {
                    count++;
                    left++;
                    right--;
                } else if (currentSum < arr[i]) {
                    left++; 
                } else {
                    right--; 
                }
            }
        }
        return count;
    }
}