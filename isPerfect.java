Given a number n, check if the number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

class Solution {
    static boolean isPerfect(int n) {
        int sum=0;
    for(int i=1;i<n;i++)
      { sum+=(n%i==0)?i:0;
       }
    boolean res=(sum==n)?true:false;
    return res;
    }
}