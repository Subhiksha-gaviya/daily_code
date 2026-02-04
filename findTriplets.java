Given an array arr[] of integers, determine whether it contains a triplet whose sum equals zero. Return true if such a triplet exists, otherwise, return false.

class Solution {
    public boolean findTriplets(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++)
        {  int left=i+1;
        int right=arr.length-1;
     while(left<right){
    int sum=arr[i]+arr[left]+arr[right];
    if(sum==0)
    {return true;
    }
        else if(sum<0)
        {left++;}
        else{
            right--;}
    }
        }
        return false;
    }
    }

