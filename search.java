Given an array, arr[] of n integers, and an integer element x, find whether element x is present in the array. Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.

class Solution {
    public int search(int arr[], int x) {
      int n=arr.length;
      for(int i=0;i<n;i++)
      {if(x==arr[i])
      {return i;}}
      return -1;  
    }
}
