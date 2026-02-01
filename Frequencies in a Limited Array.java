You are given an array arr[] containing positive integers. The elements in the array arr[] range from  1 to n (where n is the size of the array), and some numbers may be repeated or absent. Your have to count the frequency of all numbers in the range 1 to n and return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).

class Solution {
    public static void frequencyCount(int arr[], int N) {

        int[] temp = new int[N];

        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            temp[i - 1] = count;
        }

        // copy back to arr
        for (int i = 0; i < N; i++) {
            arr[i] = temp[i];
        }
    }
}
