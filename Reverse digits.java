You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.

class Solution {
    public int reverseDigits(int n) {
       int sum=0;
     while(n>0)
     {int b=n%10;
      sum=sum*10+b;
     n=n/10;
    }
    return sum;
    }
}