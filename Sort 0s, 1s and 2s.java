Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
Note: You need to solve this problem without utilizing the built-in sort function.

class Solution {
    public void sort012(int[] arr) {
        int n=arr.length;
       for(int i=0;i<n-1;i++)
       {for(int j=0;j<n-1-i;j++)
       {if(arr[j]>arr[j+1])
           {int temp=arr[j];
       arr[j]=arr[j+1];
       arr[j+1]=temp;
    }}
       }  
    }
}


optimal code

class Solution {
    public void sort012(int[] arr) {
        int low = 0, mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } 
            else if (arr[mid] == 1) {
                mid++;
            } 
            else { // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
