
Given an array arr[]. Your task is to find the minimum and maximum elements in the array.

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int n=arr.length;
       Arrays.sort(arr);
       ArrayList<Integer> result=new ArrayList<>();
       result.add(arr[0]);
       result.add(arr[n-1]);
    return result;}
}
